package com.free.hwt.quartz.util;

import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;

import com.free.hwt.quartz.job.QuartzJob;

/** 
 * @Description:构建QuartzJob工具类
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public class QuartzJobBuilder {

	/**
	 * 生成普通任务信息
	 * @param timerTaskModel
	 * @param orgCode
	 * @return
	 */
	public static JobDetail getQuartzJob(JobKey jobkKey,JobDataMap dataMap){
		return JobBuilder
				.newJob(QuartzJob.class)
				.withIdentity(jobkKey)
				.setJobData(dataMap)
				.build();
	}
}
