package com.free.hwt.quartz.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 通用返回代码
 * @created by Hu_wentao
 * @2016-01-24
 * @version V1.0.0
 */
public class CommonCode {
	/** 200 */
	public static String SUCCESS = "99999";
	/** 200 */
	public static String SUCCESS_VALUE = "success";
	
	/** 99998 */
	public static String FAIL = "99998";
	
	/** 99998 */
	public static String FAIL_VALUE = "操作失败";
	
	
	/** 11111 */
	public static String DUPLICATE = "11111";
	
	/** 99998 */
	public static String DUPLICATE_VALUE = "数据库主键重复";
	
	/** 505 */
	public static String SERVER_ERROR = "505";
	
	/** 505 */
	public static String SERVER_ERROR_VALUE = "服务器异常";
	
	/** 10001 */
	public static String NEED_LOGIN = "10001";
	
	/** 10001 */
	public static String NEED_LOGIN_VALUE = "需要登录";
	
	/** 10002 */
	public static String WRONG_PASSWORD = "10002";
	
	/** 10002 */
	public static String WRONG_PASSWORD_VALUE = "密码错误";
	
	/** 10008 */
	public static String MISSING_PARAMS = "10008";
	
	/** 10008 */
	public static String MISSING_PARAMS_VALUE = "缺少参数";
	
	/** 10009 */
	public static String JOB_EXSITED = "10009";
	
	/** 10009 */
	public static String JOB_EXSITED_VALUE = "任务已存在";
	
	/** 10010 */
	public static String ILLEGAL_URL = "10010";
	
	/** 10010 */
	public static String ILLEGAL_URL_VALUE = "URL不合法";
	
	/** 10011 */
	public static String STARTTIME_ILLEGAL = "10011";

	/** 10011 */
	public static String STARTTIME_ILLEGAL_VALUE = "任务起始时间非法";
	
	/** 20001 */
	public static String DISABLE_USER = "20001";
	
	/** 20001 */
	public static String DISABLE_USER_VALUE = "用户被封禁";

	/** 30001 */
	public static String DISABLE_ORGANIZATION = "30001";
	
	/** 30001 */
	public static String DISABLE_ORGANIZATION_VALUE = "组织被封禁";

	/** 状态码存储列表 */
	public static Map<String, String> allCodeMap = new HashMap<String, String>();
	
	static{

		allCodeMap.put(SUCCESS, SUCCESS_VALUE);
		allCodeMap.put(SERVER_ERROR, SERVER_ERROR_VALUE);
		allCodeMap.put(MISSING_PARAMS, MISSING_PARAMS_VALUE);
		allCodeMap.put(FAIL, FAIL_VALUE);
		allCodeMap.put(ILLEGAL_URL, ILLEGAL_URL_VALUE);
		allCodeMap.put(NEED_LOGIN, NEED_LOGIN_VALUE);
		allCodeMap.put(JOB_EXSITED, JOB_EXSITED_VALUE);
		allCodeMap.put(WRONG_PASSWORD, WRONG_PASSWORD_VALUE);
		allCodeMap.put(DISABLE_USER, DISABLE_USER_VALUE);
		allCodeMap.put(DISABLE_ORGANIZATION, DISABLE_ORGANIZATION_VALUE);
	}
	/**
	 * 获取状态码对应的消息
	 * @param code 状态码
	 * @return
	 */
	public static String getMessage(String code) {
		return allCodeMap.get(code);
	}
}
