package com.free.hwt.quartz.mapper;

import java.util.List;

import com.free.hwt.quartz.model.UserModel;

/** 
 * @Description: 用户管理Mapper
 * @author  huwentao 
 * @date 创建时间：2016年2月17日 下午2:37:36 
 * @version 1.0  
 */
public interface UserMapper {

	/**
	 * @Description:用户登录
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public UserModel userLogin(UserModel userModel);

	/**
	 * @Description:用户注册
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer userRegister(UserModel userModel);

	/**
	 * @Description:修改密码
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer modifyPassword(UserModel userModel);
	
	/**
	 * @Description:判断用户密码是否正确
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer validatePassword(UserModel userModel);

	/**
	 * @Description:判断用户名是否已存在
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer validateUserExist(UserModel userModel);
	
	/**
	 * @Description:删除用户
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer deleteUser(UserModel userModel);
	
	/**
	 * @Description:修改用户状态
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer updateStatus(UserModel userModel);
	
	/**
	 * @Description:修改用户角色
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer changeUserRole(UserModel userModel);
	
	
	/**
	 * @Description:根据组织代码分页获取所有用户
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public List<UserModel> getAllUserByOrgCodeAndPage(UserModel userModel);
	
	/**
	 * @Description:根据组织代码获取所有用户
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public List<UserModel> getAllUserByOrgCode(Integer organizationCode);
	
	/**
	 * @Description:根据组织代码获取的组织下所有用户的数量
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer getAllUserCountByOrgCode(UserModel userModel);
}
