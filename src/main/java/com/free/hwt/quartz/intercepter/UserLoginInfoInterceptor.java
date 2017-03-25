package com.free.hwt.quartz.intercepter;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.free.hwt.quartz.mapper.UserMapper;
import com.free.hwt.quartz.model.UserModel;
import com.free.hwt.quartz.util.CommonCode;
import com.free.hwt.quartz.util.HttpHeaderUtil;
import com.free.hwt.quartz.util.JsonCommon;
import com.free.hwt.quartz.util.QuartzParamUtil;
import com.free.hwt.quartz.util.UserInfoEnum;
import com.free.hwt.quartz.util.UserStateCode;

/**
 * @Description:
 * @created by Hu_wentao
 * @2016-1-25	
 * @version V1.0.0
 */
public class UserLoginInfoInterceptor implements HandlerInterceptor {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/** 用户登录Mapper */
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

 
	@Override
	@SuppressWarnings("unchecked")
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {

		Map<String, String[]> paramMap = Collections.unmodifiableMap(request.getParameterMap()) ;
		for(Entry<String, String[]> entry : paramMap.entrySet()){
			logger.error("参数键值列表如下:"+entry.getKey()+"````"+entry.getValue()[0]);
		}
		//获取请求的uri
		String uri = request.getServletPath();
		
		//判断uri是否以timer开头
		if(uri.startsWith("/timer")){
			
			//判断用户是否已经登录
			Integer userId = (Integer)request.getSession().getAttribute(UserInfoEnum.USER_ID.getValue());
			logger.info("用户ID："+userId);
			//获取用户的访问方式
			HttpHeaderUtil head = new HttpHeaderUtil(request);
			boolean isAjax = head.isAjax();
			String[] username = paramMap.get("username");
			String[] password = paramMap.get("password");
			if(null==userId){
				
				if (isAjax) {
					JsonCommon.outPutResultCodeJson(CommonCode.NEED_LOGIN, response);
				}
				else if(username!=null && !StringUtils.isEmpty(username[0]) &&
						password!=null && !StringUtils.isEmpty(password[0])){
					UserModel userModel = new UserModel();
					userModel.setUsername(username[0]);
					userModel.setPassword(password[0]);
					// 调用登录方法访问数据库
					UserModel loginResult = userMapper.userLogin(userModel);
					
					if(loginResult!=null){
						if(loginResult.getStatus()==UserStateCode.DISABLE){
							logger.info("用户："+userModel.getUsername()+"登录失败，此用户已被封禁");
							JsonCommon.outPutResultCodeJson(CommonCode.DISABLE_USER, response);
						} else if (loginResult.getOrgStatus()==QuartzParamUtil.ORGANIZATION_DISABLE){
							logger.info("用户："+userModel.getUsername()+"登录成功，此用户所属组织已被封禁");
							JsonCommon.outPutResultCodeJson(CommonCode.DISABLE_ORGANIZATION, response);
						}else{
							request.getSession().setAttribute(UserInfoEnum.USER_ID.getValue(), loginResult.getId());
							request.getSession().setAttribute(UserInfoEnum.USER_NAME.getValue(), loginResult.getName());
							request.getSession().setAttribute(UserInfoEnum.USER_ROLE.getValue(), loginResult.getRole());
							request.getSession().setAttribute(UserInfoEnum.ORGANIZATION.getValue(), loginResult.getOrganization());
							request.getSession().setAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue(), loginResult.getOrganizationCode());
							logger.info("用户："+userModel.getUsername()+"登录成功");
							return true;
						}
						
					} else {
						logger.info("用户："+userModel.getUsername()+"登录失败");
						JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
					}
				} else {
					response.sendRedirect("/login.jsp");
				}
				return Boolean.FALSE;
			}
		}

		return true;
	}

}
