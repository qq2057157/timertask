package com.free.hwt.quartz.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.free.hwt.quartz.mapper.OrganizationMapper;
import com.free.hwt.quartz.mapper.UserMapper;
import com.free.hwt.quartz.model.OrganizationModel;
import com.free.hwt.quartz.model.TimerTaskModel;
import com.free.hwt.quartz.model.UserModel;
import com.free.hwt.quartz.service.TimerTaskService;
import com.free.hwt.quartz.service.UserService;
import com.free.hwt.quartz.util.CommonCode;
import com.free.hwt.quartz.util.JsonCommon;
import com.free.hwt.quartz.util.QuartzParamUtil;
import com.free.hwt.quartz.util.UserInfoEnum;
import com.free.hwt.quartz.util.UserRoleCode;
import com.free.hwt.quartz.util.UserStateCode;

@Service
public class UserServiceImpl implements UserService{

	/**每页组织个数*/
	private static final Integer PAGE_SIZE = 6;

	/** 用户登录Mapper */
	@Autowired
	private UserMapper userMapper;

	/** 组织管理Mapper */
	@Autowired
	private OrganizationMapper organizationMapper;
	
	/** 任务管理Service */
	@Autowired
	private TimerTaskService timerTaskService;
	
	/** 多线程任务管理bean */
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;

	/**日志输出*/
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void userLogin(HttpServletRequest request,HttpServletResponse response, UserModel userModel) {
		try {
			logger.info("当前登录用户名是："+userModel.getUsername());
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
					JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
				}
				
			} else {
				logger.info("用户："+userModel.getUsername()+"登录失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info(CommonCode.getMessage(CommonCode.SERVER_ERROR)+",用户："+userModel.getUsername()+"登录失败");
			JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			e.printStackTrace();
		}
	}

	@Override
	public void userRegister(HttpServletResponse response, UserModel userModel) {

			try {
				userModel.setRole(UserRoleCode.GENERAL_USER);
				userModel.setStatus(UserStateCode.ENABLE);
				Integer insertResult = userMapper.userRegister(userModel);
				
				if(null != insertResult && insertResult > 0){
					logger.info("用户"+userModel.getUsername()+"注册成功");
					JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
				} else {
					logger.info("用户"+userModel.getUsername()+"注册失败");
					JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.info(CommonCode.getMessage(CommonCode.SERVER_ERROR)+"，用户"+userModel.getUsername()+"注册失败");
				JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
				e.printStackTrace();
			}
	}

	@Override
	public void modifyPassword(HttpServletResponse response,HttpServletRequest request, UserModel userModel) {
		try {
			
			Integer userid = (Integer)request.getSession().getAttribute(UserInfoEnum.USER_ID.getValue());
			
			String username = (String)request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue());
			
			userModel.setId(userid);
			
			// 根据用户id和用户密码从数据库中判断用户密码是否正确
			Integer queryResult = userMapper.validatePassword(userModel);
			
			if(queryResult>0){
				// 记录修改密码的时间
				Timestamp nowTime = new Timestamp(System.currentTimeMillis());
				userModel.setActionTime(nowTime);
				// 设置新密码
				userModel.setPassword(userModel.getNewPassword());
				
				// 修改数据库中的用户密码
				int updateResult = userMapper.modifyPassword(userModel);
				
				// 根据查询结果返回相应结果
				if (updateResult>0) {
					logger.info("用户"+username+"修改密码成功");
					JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
				} else {
					logger.info("用户"+username+"修改密码失败");
					JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
				}
			} else {
				logger.info("用户"+username+"输入的原密码错误");
				JsonCommon.outPutResultCodeJson(CommonCode.WRONG_PASSWORD, response);
			}
			
		} catch (Exception e) {
			logger.info(CommonCode.getMessage(CommonCode.SERVER_ERROR)+"，用户"+userModel.getUsername()+"修改密码失败");
			JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			e.printStackTrace();
		}
	}

	@Override
	public void userLogout(HttpServletResponse response,HttpServletRequest request) {
		try{
			String username = (String)request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue());
			request.getSession().removeAttribute(UserInfoEnum.USER_ID.getValue());
			request.getSession().removeAttribute(UserInfoEnum.USER_NAME.getValue());
			request.getSession().removeAttribute(UserInfoEnum.ORGANIZATION.getValue());
			request.getSession().removeAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue());
			logger.info("用户"+username+"安全退出成功");
			JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
		} catch(Exception e){
			logger.info("发生未知错误，退出发生异常");
			e.printStackTrace();
		}

	}

	@Override
	public void validateUserExist(HttpServletResponse response,
			UserModel userModel) {
		try {
			int validateResult = userMapper.validateUserExist(userModel);
			
			if(validateResult>0){
				logger.info("用户名"+userModel.getUsername()+"已被注册过");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			} else {
				logger.info("用户名"+userModel.getUsername()+"未被注册过");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			}
		} catch (Exception e) {
			logger.info("发生未知错误，判断失败");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}


		
	}

	@Override
	public String userManageMain(HttpServletRequest request,
			HttpServletResponse response, UserModel userModel) {
		if(null==userModel.getPageSize() || userModel.getPageSize()==0)userModel.setPageSize(PAGE_SIZE);
		Integer orgCode = (Integer)request.getSession().getAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue());
		Integer userRole = (Integer)request.getSession().getAttribute(UserInfoEnum.USER_ROLE.getValue());

		userModel.setOrganizationCode(orgCode);
		
		// 若不是系统管理员，则设置为组织管理员
		if(null!=userRole && userRole==UserRoleCode.ADMINISTRATOR){
			userModel.setRole(userRole);	
		}else {
			userModel.setRole(UserRoleCode.ORG_ADMINISTRATOR);
		}
		
		int totalCount = userMapper.getAllUserCountByOrgCode(userModel);
	
		int totalPages = 0;
	
		if (totalCount % PAGE_SIZE == 0) {
			totalPages = totalCount / PAGE_SIZE;
		} else {
			totalPages = totalCount / PAGE_SIZE + 1;
		}
		int currentPage = 0;
		// 若当前页的页号小于等于0.则将其设置为0，否则将获取的页数*每页显示条数作为查询条件
		if(null==userModel.getCurrentPage() || userModel.getCurrentPage() <= 0){
			userModel.setCurrentPage(1);
			currentPage = 1;
		// 如果当前页数大于总页数,将其设置为总页数
		} else if (currentPage >= totalPages){
			currentPage = totalPages;
			userModel.setCurrentPage(totalPages);
		} else {
			currentPage = userModel.getCurrentPage();
		}

		logger.info("总记录数为:" + totalCount + ",每页显示条数为：" + PAGE_SIZE + ",总页数为:" + totalPages);
		userModel.setStart((currentPage-1)*PAGE_SIZE);

		List<UserModel> userModels = userMapper.getAllUserByOrgCodeAndPage(userModel);
		
		request.setAttribute("userModels", userModels);
		request.setAttribute("sumNum", totalCount);
		request.setAttribute("pageSize", userModel.getPageSize());
		request.setAttribute("currentPage", userModel.getCurrentPage());
		
		return "WEB-INF/UserManager";

	}

	@Override
	public void disableUser(HttpServletRequest request,
			HttpServletResponse response, UserModel userModel) {
		try {
			userModel.setStatus(UserStateCode.DISABLE);
			userModel.setActionTime(new Timestamp(System.currentTimeMillis()));
			Integer updateResult= userMapper.updateStatus(userModel);
			if (updateResult>0) {
				logger.info("封禁id为:"+userModel.getId()+"的用户成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			} else {
				logger.info("封禁id为:"+userModel.getId()+"的用户失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("封禁id为:"+userModel.getId()+"的用户失败，失败原因为服务器发生错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}
	}

	@Override
	public void enableUser(HttpServletRequest request,
			HttpServletResponse response, UserModel userModel) {
		try {
			userModel.setStatus(UserStateCode.ENABLE);
			userModel.setActionTime(new Timestamp(System.currentTimeMillis()));
			Integer updateResult= userMapper.updateStatus(userModel);
			if (updateResult>0) {
				logger.info("解禁id为:"+userModel.getId()+"的用户成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			} else {
				logger.info("解禁id为:"+userModel.getId()+"的用户失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("解禁id为:"+userModel.getId()+"的用户失败，失败原因为服务器发生错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}	
	}

	@Override
	public void deleteUser(HttpServletRequest request,
			HttpServletResponse response, UserModel userModel) {
		try {
			DeleteUsersTask deleteUsersTask= new DeleteUsersTask(userModel.getId());
			
			taskExecutor.execute(deleteUsersTask);

			Integer deleteResult= userMapper.deleteUser(userModel);
			if (deleteResult>0) {
				logger.info("删除id为:"+userModel.getId()+"的用户成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			} else {
				logger.info("删除id为:"+userModel.getId()+"的用户失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("删除id为:"+userModel.getId()+"的用户失败，失败原因为服务器发生错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}	
	}

	@Override
	public void setAdminUser(HttpServletRequest request,
			HttpServletResponse response, UserModel userModel) {
		try {

			userModel.setActionTime(new Timestamp(System.currentTimeMillis()));
			userModel.setRole(UserRoleCode.ORG_ADMINISTRATOR);
			Integer organizationCode = userModel.getOrganizationCode();
			Integer changeResult = userMapper.changeUserRole(userModel);
			
			if (changeResult>0) {
				OrganizationModel organizationModel = new OrganizationModel();
				
				organizationModel.setAdministratorId(userModel.getId());
				organizationModel.setOrganizationCode(organizationCode);
				organizationModel.setActionTime(new Timestamp(System.currentTimeMillis()));
				Integer adminId= organizationMapper.getAdminIdByCode(organizationCode);
				changeResult = organizationMapper.setOrganizationAdmin(organizationModel);

				if(changeResult >0){
					
					if(null != adminId){
						
						userModel.setId(adminId);
						userModel.setRole(UserRoleCode.GENERAL_USER);
						changeResult= userMapper.changeUserRole(userModel);
						
						if(changeResult>0){
							
							logger.info("成功设置id为:"+userModel.getId()+"的用户为组织管理员");
							JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
							
							// 若设置原管理员的角色为普通用户失败，则将原先所做的操作还原
						} else if(changeResult>0 ){
							
							userModel.setRole(UserRoleCode.GENERAL_USER);
							userMapper.changeUserRole(userModel);
							organizationModel.setAdministratorId(adminId);
							organizationMapper.setOrganizationAdmin(organizationModel);
							logger.info("设置id为:"+userModel.getId()+"的用户为组织管理员失败");
							JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
						}
					} else {
						logger.info("成功设置id为:"+userModel.getId()+"的用户为组织管理员");
						JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
					}
					
				// 若设置组织信息表的管理员ID失败则将已修改为管理员的角色改成普通用户
				} else {
					userModel.setRole(UserRoleCode.GENERAL_USER);
					userMapper.changeUserRole(userModel);
					logger.info("设置id为:"+userModel.getId()+"的用户为组织管理员失败");
					JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
				}
			} else {
				
				logger.info("设置id为:"+userModel.getId()+"的用户为组织管理员失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
			
		} catch (Exception e) {
			logger.info("设置id为:"+userModel.getId()+"的用户为组织管理员失败，失败原因为服务器发生错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}	
	}

	@Override
	public void addUser(HttpServletRequest request,
			HttpServletResponse response, UserModel userModel) {
		
		String username = (String)request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue());

		try{
			if(StringUtils.isEmpty(userModel.getOrganization()) || null==userModel.getOrganizationCode()){
				String organization = (String)request.getSession().getAttribute(UserInfoEnum.ORGANIZATION.getValue());
				Integer organizationCode = (Integer)request.getSession().getAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue());
				userModel.setOrganization(organization);
				userModel.setOrganizationCode(organizationCode);
			}
			
			userModel.setRole(UserRoleCode.GENERAL_USER);
			userModel.setStatus(UserStateCode.ENABLE);
			Integer insertResult = userMapper.userRegister(userModel);
			
			if(null != insertResult && insertResult > 0){
				logger.info(username+"新增用户:"+userModel.getUsername()+"成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			} else {
				logger.info(username+"新增用户:"+userModel.getUsername()+"注册失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		
		} catch (Exception e) {
			// TODO: handle exception
			logger.info(username+"新增用户:"+userModel.getUsername()+"失败，失败原因为未知的服务器错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}
	}

	class DeleteUsersTask implements Runnable{

		private Integer id;
		
		DeleteUsersTask(Integer id){
			this.id = id;
		}
		@Override
		public void run() {
			
			try {
				List<TimerTaskModel> timerTaskModels = timerTaskService.getAllTimerTaskInfo(id);
				for (TimerTaskModel timerTaskModel : timerTaskModels) {
					timerTaskService.deleteTimerTask(timerTaskModel);
				}
			} catch (Exception e) {
				logger.error("删除任务发生异常");
				e.printStackTrace();
			}
			

		}
	}
}
