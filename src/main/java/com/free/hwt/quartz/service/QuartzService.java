package com.free.hwt.quartz.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.free.hwt.quartz.model.TimerTaskModel;
/** 
 * @Description:Quartz任务管理Service
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
@Service
public interface QuartzService {

	/**
	 * @Description:添加定时任务到Quartz
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void scheduleTask(TimerTaskModel timerTaskModel,HttpServletResponse response,HttpServletRequest request);
	
	/**
	 * @Description:移除Quartz中的定时任务
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public boolean unScheduleTask(TimerTaskModel timerTaskModel);
	
	/**
	 * @Description:检查Quartz中是否有此定时任务
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public boolean checkTaskIsScheduld(TimerTaskModel timerTaskModel);


}
