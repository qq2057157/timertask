package com.free.hwt.quartz.model;

import java.sql.Timestamp;

/** 
 * @Description:组织信息Model
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public class OrganizationModel {

	/** 组织id */
	private Integer id;
	
	/** 组织名称 */
	private String organization;
	
	/** 组织代码 */
	private Integer organizationCode;
	
	/** 管理员id */
	private Integer administratorId;
	
	/** 管理员姓名 */
	private String adminName;
	
	/** 管理员账号 */
	private String adminUsername;
	
	/** 管理员联系方式 */
	private String adminPhone;

	/** 组织状态 */
	private Integer status;
	
	/** 数据更新时间 */
	private Timestamp actionTime;
	
	/** 数据创建时间 */
	private Timestamp createTime;

	/**总条数*/
	private Integer sumNum;
	
	/**显示条数*/
	private Integer pageSize;
	
	/**当前页*/
	private Integer currentPage;
	
	/**起始条数*/
	private Integer start;
	
	public Integer getSumNum() {
		return sumNum;
	}

	public void setSumNum(Integer sumNum) {
		this.sumNum = sumNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Integer getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(Integer organizationCode) {
		this.organizationCode = organizationCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Timestamp getActionTime() {
		return actionTime;
	}

	public void setActionTime(Timestamp actionTime) {
		this.actionTime = actionTime;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminPhone() {
		return adminPhone;
	}

	public void setAdminPhone(String adminPhone) {
		this.adminPhone = adminPhone;
	}

	public Integer getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(Integer administratorId) {
		this.administratorId = administratorId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
}
