package com.free.hwt.quartz.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.free.hwt.quartz.model.OrganizationModel;
import com.free.hwt.quartz.model.UserModel;
/** 
 * @Description:组织管理Service
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
@Service
public interface OrganizationService {

	/**
	 * @Description:组织管理主界面
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public String organizationMain(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel);

	/**
	 * @Description:新增组织
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void addOrganization(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel);

	/**
	 * @Description:封禁组织
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void disableOrganization(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel);

	/**
	 * @Description:解禁组织
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void enableOrganization(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel);

	/**
	 * @Description:删除组织并删除相应的用户和用户所创建的任务
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void deleteOrganization(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel);

	/**
	 * @Description:为组织添加管理员
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void addOrganizationAdministrator(HttpServletRequest request,HttpServletResponse response,UserModel userModel);

	/**
	 * @Description:检查此组织是否已存在数据库
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:38:15
	 */
	public void checkOrgExist(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel);

}
