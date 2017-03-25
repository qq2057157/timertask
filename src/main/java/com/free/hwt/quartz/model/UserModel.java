package com.free.hwt.quartz.model;

import java.sql.Timestamp;

/** 
 * @Description:用户信息Model
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public class UserModel {
	
	/** 用户id */
	private Integer id;
	
	/** 用户登录账户 */
	private String username;
	
	/** 用户密码 */
	private String password;
	
	/** 用户名称 */
	private String name;
	
	/** 用户角色 1:超级管理员，2:组织管理员，4:普通用户 */
	private Integer role;
	
	/** 用户所属组织 */
	private String organization;
	
	/** 组织当前状态 0:未启用，1:正常,4:封禁 */
	private Integer orgStatus;

	/** 用户所属组织代码 */
	private Integer organizationCode;
	
	/** 邮箱 */
	private String email;
	
	/** 联系电话 */
	private String phone;
	
	/** 用户状态 1:正常,4:封禁 */
	private Integer status;
	
	/** 数据更新时间 */
	private Timestamp actionTime;
	
	/** 数据创建时间 */
	private Timestamp createTime;

	/** 用户新密码 */
	private String newPassword;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(Integer organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public Integer getOrgStatus() {
		return orgStatus;
	}

	public void setOrgStatus(Integer orgStatus) {
		this.orgStatus = orgStatus;
	}
}
