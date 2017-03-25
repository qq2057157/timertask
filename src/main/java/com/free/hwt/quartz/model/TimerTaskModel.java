package com.free.hwt.quartz.model;

import java.sql.Timestamp;

/** 
 * @Description:定时任务信息Model
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public class TimerTaskModel {
	

	/**任务ID*/
	private Integer id;
	
	/**任务创建者ID*/
	private Integer userId;
	
	/**任务创建者名字*/
	private String name;
	
	/**当前登录用户角色*/
	private Integer userRole;
	
	/**当前登录用户的组织代码*/
	private Integer organizationCode;
	
	/**任务目标URL*/
	private String targetUrl;
	
	/**任务参数列表*/
	private String parameters;
	
	/**任务名*/
	private String jobName;

	/**触发器名*/
	private String triggerName;

	/**cron表达式*/
	private String cronExpress;
	
	/**任务组名称*/
	private String jobGroup;
	
	/**调度器组名称*/
	private String triggerGroup;
	
	/**触发器类型*/
	private Integer triggerType;

	/**重复次数*/
	private Integer repeatCount;
	
	/**开始时间*/
	private Timestamp startTime;
	
	/**结束时间*/
	private Timestamp endTime;
	
	/**任务执行间隔时间*/
	private int repeatInterval;

	/**任务状态*/
	private int status;

	/**开始时间*/
	private Timestamp actionTime;
	
	/**开始时间*/
	private Timestamp createTime;

	/**总条数*/
	private Integer sumNum;
	
	
	/**显示条数*/
	private Integer pageSize;
	
	/**当前页*/
	private Integer currentPage;
	
	/**起始条数*/
	private Integer start;
	
	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}

	public String getCronExpress() {
		return cronExpress;
	}

	public void setCronExpress(String cronExpress) {
		this.cronExpress = cronExpress;
	}
	
	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getTriggerGroup() {
		return triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

	public Integer getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(Integer triggerType) {
		this.triggerType = triggerType;
	}

	public Integer getRepeatCount() {
		return repeatCount;
	}

	public void setRepeatCount(Integer repeatCount) {
		this.repeatCount = repeatCount;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public int getRepeatInterval() {
		return repeatInterval;
	}

	public void setRepeatInterval(int repeatInterval) {
		this.repeatInterval = repeatInterval;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public Integer getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(Integer organizationCode) {
		this.organizationCode = organizationCode;
	}
	
}
