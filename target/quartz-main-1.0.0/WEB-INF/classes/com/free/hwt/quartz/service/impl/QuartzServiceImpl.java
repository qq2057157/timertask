package com.free.hwt.quartz.service.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.ListenerManager;
import org.quartz.Matcher;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.free.hwt.quartz.job.listener.QuartzJobListener;
import com.free.hwt.quartz.job.listener.QuartzTriggerListener;
import com.free.hwt.quartz.model.TimerTaskModel;
import com.free.hwt.quartz.service.QuartzService;
import com.free.hwt.quartz.util.CommonCode;
import com.free.hwt.quartz.util.JsonCommon;
import com.free.hwt.quartz.util.QuartzJobBuilder;
import com.free.hwt.quartz.util.QuartzParamUtil;
import com.free.hwt.quartz.util.QuartzTriggerBuilder;

@Service
public class QuartzServiceImpl implements QuartzService {
	
	/** 日志记录 */
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/** Scheduler工厂 */
	StdSchedulerFactory factory = new StdSchedulerFactory();

	@Override
	public void scheduleTask(TimerTaskModel timerTaskModel,HttpServletResponse response,HttpServletRequest request) {
		
		try {
			Scheduler scheduler = factory.getScheduler();
			
			// 生成任务的key
			JobKey jobKey = new JobKey(timerTaskModel.getJobName(), timerTaskModel.getJobGroup());

			// 生成触发器的key
			TriggerKey triggerKey = new TriggerKey(timerTaskModel.getTriggerName(), timerTaskModel.getTriggerGroup());
			
			logger.info("任务是否存在数据库"+scheduler.checkExists(jobKey));
			
			logger.info("触发器是否存在数据库"+scheduler.checkExists(triggerKey));
			JobDetail detail;
			// 若任务不存在
			if(!scheduler.checkExists(jobKey)){
				
				// 添加监听器
				ListenerManager listenerManager= scheduler.getListenerManager();
				Matcher<JobKey> jobMatcher = KeyMatcher.keyEquals(jobKey);
				Matcher<TriggerKey> triggerMatcher = KeyMatcher.keyEquals(triggerKey);
				listenerManager.addJobListener(new QuartzJobListener(), jobMatcher);
				listenerManager.addTriggerListener(new QuartzTriggerListener(), triggerMatcher);;
				
				// 添加任务参数Map
				JobDataMap dataMap = new JobDataMap();
				if(!StringUtils.isEmpty(timerTaskModel.getParameters())){
					JSONObject parammeters= (JSONObject)JSON.parse(timerTaskModel.getParameters());
					for (Map.Entry<String, Object>  entry: parammeters.entrySet()) {
						dataMap.put(entry.getKey(), entry.getValue().toString());
					}
				}
				
				// 添加目标URL
				dataMap.put(QuartzParamUtil.TARGET_URL, timerTaskModel.getTargetUrl());
				// 创建任务对象
				detail = QuartzJobBuilder.getQuartzJob(jobKey , dataMap);
				logger.info("任务是否持久化"+detail.isDurable());

			} else {
				// 若任务已存在，则唤醒任务
				detail = scheduler.getJobDetail(jobKey);
			}
	
			// quartz的表中不存在此任务
			if(!scheduler.checkExists(triggerKey)){
				if(timerTaskModel.getTriggerType()==QuartzParamUtil.CRON_TYPE){
					CronTrigger cTrigger = QuartzTriggerBuilder.getCronTrigger(timerTaskModel);
					scheduler.scheduleJob(detail, cTrigger);
					
				} else {
					SimpleTrigger sTrigger = QuartzTriggerBuilder.getSimpleTrigger(timerTaskModel);
					if(null==sTrigger){
						JsonCommon.outPutResultCodeJson(CommonCode.MISSING_PARAMS, response);
					}
					scheduler.scheduleJob(detail, sTrigger);
					
				}
			} else {
				
				// 若任务信息已存在，则从数据库中取得任务信息
				if(timerTaskModel.getTriggerType()==QuartzParamUtil.CRON_TYPE){
					CronTrigger cTrigger = (CronTrigger)scheduler.getTrigger(triggerKey);
					scheduler.scheduleJob(detail, cTrigger);
					
				} else {
					SimpleTrigger sTrigger =(SimpleTrigger)scheduler.getTrigger(triggerKey);
					scheduler.scheduleJob(detail, sTrigger);
				}
			}
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	@Override
	public boolean unScheduleTask(TimerTaskModel timerTaskModel) {
		try {
			Scheduler scheduler = factory.getScheduler();
			JobKey jobKey = new JobKey(timerTaskModel.getJobName(), timerTaskModel.getJobGroup());
			TriggerKey triggerKey = new TriggerKey(timerTaskModel.getTriggerName(), timerTaskModel.getTriggerGroup());
			
			if(scheduler.checkExists(triggerKey)){
				scheduler.unscheduleJob(triggerKey);
			}

			if(scheduler.checkExists(jobKey)){
				scheduler.deleteJob(jobKey);
			}
			logger.info("成功终止id为"+timerTaskModel.getId()+"的定时任务");
			return true;
		} catch (SchedulerException e) {
			logger.info("终止id为"+timerTaskModel.getId()+"的定时任务时发生错误");
			e.printStackTrace();
			return false;
		}
		
	}
	@Override
	public boolean checkTaskIsScheduld(TimerTaskModel timerTaskModel) {
		
		try {
			Scheduler scheduler = factory.getScheduler();
			//JobKey jobKey = new JobKey(timerTaskModel.getJobName(), timerTaskModel.getJobGroup());
			TriggerKey triggerKey = new TriggerKey(timerTaskModel.getTriggerName(), timerTaskModel.getTriggerGroup());
			
			if(scheduler.checkExists(triggerKey)){
				return true;
			}
				
		} catch (SchedulerException e) {

			e.printStackTrace();
		}
		
		return false;
		
	}

}
