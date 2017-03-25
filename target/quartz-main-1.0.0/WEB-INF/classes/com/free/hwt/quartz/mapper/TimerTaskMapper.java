package com.free.hwt.quartz.mapper;

import java.util.List;

import com.free.hwt.quartz.model.TimerTaskModel;

/** 
 * @Description: 定时任务管理Mapper
 * @author  huwentao 
 * @date 创建时间：2016年2月17日 下午2:37:36 
 * @version 1.0  
 */
public interface TimerTaskMapper {
	
	/**
	 * @Description:添加定时任务到自定义数据库表中
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer addTimerTask(TimerTaskModel TimerTaskModel);
	
	/**
	 * @Description:删除自定义数据库表中的定时任务
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer deleteTimerTask(TimerTaskModel TimerTaskModel);
	
	/**
	 * @Description:查询数据库中的定时任务信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public TimerTaskModel getTimerTaskInfo(TimerTaskModel timerTaskModel);
	
	/**
	 * @Description:根据用户Id分页查询数据库中的此用户的定时任务信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public List<TimerTaskModel> getAllTimerTaskInfoByPage(TimerTaskModel timerTaskModel);
	
	/**
	 * @Description:根据用户Id查询数据库中的此用户的定时任务信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public List<TimerTaskModel> getAllTimerTaskInfo(Integer userId);
	
	/**
	 * @Description:根据用户Id查询数据库中的此用户的定时任务的条数
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer getAllTimerTaskCount(TimerTaskModel timerTaskModel);

	/**
	 * @Description:修改任务状态信息
	 * @author  huwentao 
	 * @date 创建时间：2016年2月17日 下午2:31:30
	 * @param
	 * @return
	 */
	public Integer modifyJobStatus (TimerTaskModel timerTaskModel);
	
}
