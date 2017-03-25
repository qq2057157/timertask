package com.free.hwt.quartz.util;

import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.free.hwt.quartz.model.TimerTaskModel;

/** 
 * @Description:Trigger构建工具类
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public class QuartzTriggerBuilder {

	public static Logger logger = LoggerFactory.getLogger(QuartzTriggerBuilder.class);
	/**
	 * 生成一个简单类型触发器
	 * @param timerTaskModel
	 * @return
	 */
	public static SimpleTrigger getSimpleTrigger(TimerTaskModel timerTaskModel){
		
		logger.info("任务开始时间是"+new Date(timerTaskModel.getStartTime().getTime()));
		logger.info("任务设定执行次数是"+timerTaskModel.getRepeatCount());
		if(null!=timerTaskModel.getEndTime()){
			return (SimpleTrigger)TriggerBuilder
					.newTrigger()
					.withIdentity(timerTaskModel.getTriggerName(),timerTaskModel.getTriggerGroup())//触发器组名
					.startAt(new Date(timerTaskModel.getStartTime().getTime())).withSchedule(SimpleScheduleBuilder.simpleSchedule()
							.withIntervalInSeconds(timerTaskModel.getRepeatInterval())).endAt(timerTaskModel.getEndTime()).build();
		} else if(null!=timerTaskModel.getRepeatCount()){
			return (SimpleTrigger)TriggerBuilder
			.newTrigger()
			.withIdentity(timerTaskModel.getTriggerName(),timerTaskModel.getTriggerGroup())//触发器组名
			.startAt(new Date(timerTaskModel.getStartTime().getTime())).withSchedule(SimpleScheduleBuilder.simpleSchedule()
					.withIntervalInSeconds(timerTaskModel.getRepeatInterval()).withRepeatCount(timerTaskModel.getRepeatCount())).build();
	
		} else {
			
			return null;
		}
		
	}
	
	/**
	 * 生成一个cron类型触发器
	 * @param timerTaskModel
	 * @return
	 */
	public static CronTrigger getCronTrigger(TimerTaskModel timerTaskModel){
		
		return (CronTrigger)TriggerBuilder
				.newTrigger()
				.withIdentity(timerTaskModel.getTriggerName(),timerTaskModel.getTriggerGroup())//触发器组名
				.withSchedule(CronScheduleBuilder.cronSchedule(timerTaskModel.getCronExpress()).withMisfireHandlingInstructionDoNothing())
				.build();
	}
	
}
