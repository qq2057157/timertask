package com.free.hwt.quartz.mapper;

import java.util.List;

import com.free.hwt.quartz.model.OrganizationModel;

/** 
 * @Description:组织管理Mapper
 * @author  huwentao 
 * @date 创建时间：2016年2月17日 下午2:37:36 
 * @version 1.0  
 */
public interface OrganizationMapper {
	/**
	 * @Description:取得所有组织信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:38:15
	 * @param
	 * @return
	 */
	public List<OrganizationModel> getAllOrganizationInfo(OrganizationModel organizationModel);
	
	/**
	 * @Description:取得所有组织信息的条数
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:38:15
	 * @param
	 * @return
	 */
	public Integer getOrganizationCount();
	
	/**
	 * @Description:检查此组织是否已存在数据库
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:38:15
	 * @param
	 * @return
	 */
	public OrganizationModel checkOrgExist(OrganizationModel organizationModel);
	
	/**
	 * @Description:修改组织状态
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:38:15
	 * @param
	 * @return
	 */
	public Integer updateOrganizationStatus(OrganizationModel organizationModel);
	
	/**
	 * @Description:删除一条组织信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:38:15
	 * @param
	 * @return
	 */
	public Integer deleteOrganization(OrganizationModel organizationModel);
	
	/**
	 * @Description:新增一条组织信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:38:15
	 * @param
	 * @return
	 */
	public Integer addOrganization(OrganizationModel organizationModel);
	
	/**
	 * @Description:为组织设置管理员的id
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:38:15
	 * @param
	 * @return
	 */
	public Integer setOrganizationAdmin(OrganizationModel organizationModel);
	
	/**
	 * @Description:根据组织代码取得管理员Id
	 * @author  huwentao 
	 * @date 创建时间：2016年2月21日 下午2:38:15
	 * @param
	 * @return
	 */
	public Integer getAdminIdByCode(Integer organizationCode);
}
