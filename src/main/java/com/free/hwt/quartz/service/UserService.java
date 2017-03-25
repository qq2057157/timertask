package com.free.hwt.quartz.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import com.free.hwt.quartz.model.UserModel;

/**
 * @Description: 用户登录管理Service
 * @created by Hu_wentao
 * @2016-1-25
 * @version V1.0.0
 */
@Service
public interface UserService {
	
	/**
	 * @Description: 用户登录
	 */
	public void userLogin(HttpServletRequest request,HttpServletResponse response,UserModel userModel);
	
	/**
	 * @Description: 用户注册
	 */
	public void userRegister(HttpServletResponse response,UserModel userModel);

	/**
	 * @Description: 修改密码
	 */
	public void modifyPassword(HttpServletResponse response,HttpServletRequest request,UserModel userModel);
	
	/**
	 * @Description: 用户登出
	 */
	public void userLogout(HttpServletResponse response,HttpServletRequest request);
	
	/**
	 * @Description: 用户登出
	 */
	public void validateUserExist(HttpServletResponse response,UserModel userModel);
	
	/**
	 * @Description: 用户管理页面
	 */
	public String userManageMain(HttpServletRequest request,HttpServletResponse response,UserModel userModel);
	
	/**
	 * @Description: 封禁用户
	 */
	public void disableUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel);
	
	/**
	 * @Description: 解禁用户
	 */
	public void enableUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel);

	/**
	 * @Description: 删除用户
	 */
	public void deleteUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel);

	/**
	 * @Description: 设置用户为组织管理员
	 */
	public void setAdminUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel);
	
	/**
	 * @Description: 新增用户
	 */
	public void addUser(HttpServletRequest request,HttpServletResponse response,UserModel userModel);
	
}
