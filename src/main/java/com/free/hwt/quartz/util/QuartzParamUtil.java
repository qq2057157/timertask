package com.free.hwt.quartz.util;

/**
 * @Description: 通用常量集合接口
 * @created by Hu_wentao
 * @2016-1-28
 * @version V1.0.0
 */
public interface QuartzParamUtil {
	
	/**UNDERLINE*/
	public static final String UNDERLINE = "_";
	
	/**任务组前缀名*/
	public static final String JOB_GROUP_PREFIX = "JOB_GROUP_";
	
	/**触发器组前缀名*/
	public static final String TRIGGER_GROUP_PREFIX = "TRIGGER_GROUP_";
	
	/**任务组前缀名*/
	public static final String JOB_PREFIX = "JOB_";
	
	/**触发器组前缀名*/
	public static final String TRIGGER_PREFIX = "TRIGGER_";

	/**cron表达式类型标识*/
	public static final Integer CRON_TYPE = 1;

	/**simple类型标识*/
	public static final Integer SIMPLE_TYPE = 0;
	
	/**任务未发布状态*/
	public static final int UN_SCHEDULED = 0;
	
	/**任务已发布状态**/
	public static final int SCHEDULED = 1;
	
	/**任务已失效状态*/
	public static final int INVALID_TASK = 4;
	
	/**任务目标URL**/
	public static final String TARGET_URL = "targetUrl";
	
	/**任务目标URL的请求方式**/
	public static final String TARGET_URL_METHOD = "method";
	
	/**组织未激活(未设置管理员)状态代码*/
	public static final Integer ORGANIZATION_UN_ACTIVE = 0;

	/**组织正常状态代码*/
	public static final Integer ORGANIZATION_NORMAL = 1;

	/**组织封禁状态代码*/
	public static final Integer ORGANIZATION_DISABLE = 4;
}
