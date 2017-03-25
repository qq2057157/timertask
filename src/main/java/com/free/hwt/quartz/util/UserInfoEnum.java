package com.free.hwt.quartz.util;

/** 
 * @Description:Session字段枚举类
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public enum UserInfoEnum {

	USER_ID("userId"),// 任务的目标URL
	USER_ROLE("userRole"),
	USER_NAME("userName"),// 任务名
	ORGANIZATION("organization"),// 任务ID
	ORGANIZATION_CODE("organizationCode");// 触发器类型
	private String value;
	
	/**
	 * 
	 */
	private UserInfoEnum(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
}
