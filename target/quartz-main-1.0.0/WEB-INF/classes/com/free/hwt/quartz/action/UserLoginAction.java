package com.free.hwt.quartz.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.free.hwt.quartz.model.OrganizationModel;
import com.free.hwt.quartz.model.UserModel;
import com.free.hwt.quartz.service.OrganizationService;
import com.free.hwt.quartz.service.UserService;

/**
 * @Description: 用户登录管理action
 * @created by Hu_wentao
 * @2016-1-25
 * @version V1.0.0
 */
@Controller
@RequestMapping("passport/user")
public class UserLoginAction {	
	
	/** 用户登录Service */
	@Autowired
	private UserService userLoginService;

	/** 组织管理Service */
	@Autowired
	private OrganizationService organizationService;
	
	/**日志输出*/
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * @Description: 用户登录
	 */
	@RequestMapping("login")
	public void userLogin(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		logger.info("用户登录");
		userLoginService.userLogin(request,response, userModel);
	}
	
	/**
	 * @Description: 用户注册
	 */
	@RequestMapping("register")
	public void userRegister(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userLoginService.userRegister(response, userModel);
	}
	
	/**
	 * @Description: 用户登出
	 */
	@RequestMapping("logout")
	public void userLogout(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userLoginService.userLogout(response, request);
	}
	
	/**
	 * @Description: 判断用户是否存在
	 */
	@RequestMapping("validateExist")
	public void validateUserExist(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userLoginService.validateUserExist(response,userModel);
	}
	
	/**
	 * @Description: 判断用户是否存在
	 */
	@RequestMapping("checkOrgExist")
	public void checkOrgExist(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel){
		organizationService.checkOrgExist(request, response, organizationModel);
	}
}
