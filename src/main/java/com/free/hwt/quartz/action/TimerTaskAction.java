package com.free.hwt.quartz.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.free.hwt.quartz.model.TimerTaskModel;
import com.free.hwt.quartz.service.TimerTaskService;
import com.free.hwt.quartz.util.UserInfoEnum;

@Controller
@RequestMapping("timer/task")
public class TimerTaskAction {
	/**日志输出*/
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private TimerTaskService timerTaskService;

	@RequestMapping("main")
	public String timerTaskMain(HttpServletRequest request,HttpServletResponse response,TimerTaskModel timerTaskModel){
		
		logger.info("用户名："+request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue()));
		
		return  timerTaskService.getAllTimerTaskInfoByPage(request, response, timerTaskModel);
	}
	
	@RequestMapping("add")
	public void addTimerTask(HttpServletRequest request,HttpServletResponse response,TimerTaskModel timerTaskModel){
		
		logger.info("用户名："+request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue()));
		timerTaskService.addTimerTask(response, request, timerTaskModel);
	}
	
	@RequestMapping("start")
	public void startTimerTask(HttpServletRequest request,HttpServletResponse response,TimerTaskModel timerTaskModel){
		
		logger.info("用户名："+request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue()));
		timerTaskService.startTimerTask(response, request, timerTaskModel);
	}

	@RequestMapping("stop")
	public void stopTimerTask(HttpServletRequest request,HttpServletResponse response,TimerTaskModel timerTaskModel){
		
		logger.info("用户名："+request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue()));
		timerTaskService.stopTimerTask(request, response, timerTaskModel);
	}
	
	@RequestMapping("delete")
	public void deleteTimerTask(HttpServletRequest request,HttpServletResponse response,TimerTaskModel timerTaskModel){
		 
		logger.info("用户名："+request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue()));
		timerTaskService.deleteTimerTask(request, response, timerTaskModel);
	}
}
