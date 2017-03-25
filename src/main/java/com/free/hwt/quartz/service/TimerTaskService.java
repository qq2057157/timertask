package com.free.hwt.quartz.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.free.hwt.quartz.model.TimerTaskModel;

@Service
/** 
 * @Description:定时任务管理Service
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public interface TimerTaskService {
	/**
	 * @Description:添加定时任务
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void addTimerTask(HttpServletResponse response,HttpServletRequest request,TimerTaskModel taskModel);
	
	/**
	 * @Description:启动定时任务
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void startTimerTask(HttpServletResponse response,HttpServletRequest request,TimerTaskModel taskModel);

	/**
	 * @Description:终止定时任务
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void stopTimerTask(HttpServletRequest request,HttpServletResponse response,TimerTaskModel timerTaskModel);

	/**
	 * @Description:删除定时任务
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void deleteTimerTask(HttpServletRequest request,HttpServletResponse response,TimerTaskModel timerTaskModel);
	
	/**
	 * @Description:分页取得用户创建的任务信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public String getAllTimerTaskInfoByPage(HttpServletRequest request,HttpServletResponse response,TimerTaskModel timerTaskModel);

	/**
	 * @Description:删除定时任务Overload
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public void deleteTimerTask(TimerTaskModel timerTaskModel) throws Exception;

	/**
	 * @Description:取得用户创建的所有任务信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月1日 下午2:37:36 
	 */
	public List<TimerTaskModel> getAllTimerTaskInfo(Integer userId) throws Exception;

}
