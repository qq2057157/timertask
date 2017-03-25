package com.free.hwt.quartz.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.free.hwt.quartz.model.UserModel;
import com.free.hwt.quartz.service.UserService;

@Controller
@RequestMapping("timer/user")
public class UserManageAction {


	/** 用户管理Service */
	@Autowired
	private UserService userService;
	
	/**
	 * @Description: 修改密码
	 */
	@RequestMapping("modifypassword")
	public void modifyPassword(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userService.modifyPassword(response,request, userModel);
	}
	
	/**
	 * @Description: 用户管理页面
	 */
	@RequestMapping("main")
	public String userManageMain(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		return userService.userManageMain(request, response, userModel);
	}
	
	/**
	 * @Description: 封禁用户
	 */
	@RequestMapping("disable")
	public void disableUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userService.disableUser(request, response, userModel);
	}
	
	/**
	 * @Description: 解禁用户
	 */
	@RequestMapping("enable")
	public void enableUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userService.enableUser(request, response, userModel);
	}
	
	/**
	 * @Description: 删除用户
	 */
	@RequestMapping("delete")
	public void deleteUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userService.deleteUser(request, response, userModel);
	}
	
	/**
	 * @Description: 设置用户为组织管理员
	 */
	@RequestMapping("setAdmin")
	public void setAdminUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userService.setAdminUser(request, response, userModel);
	}
	
	/**
	 * @Description: 添加用户
	 */
	@RequestMapping("add")
	public void addUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		userService.addUser(request,response, userModel);
	}
}
