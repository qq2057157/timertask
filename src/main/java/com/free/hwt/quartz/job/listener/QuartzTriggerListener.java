package com.free.hwt.quartz.job.listener;

import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerKey;
import org.quartz.Trigger.CompletedExecutionInstruction;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.TriggerListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuartzTriggerListener implements TriggerListener {

	StdSchedulerFactory factory = new StdSchedulerFactory();
	
	/**日志输出*/
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "QuartzTriggerListener";
	}

	@Override
	public void triggerComplete(Trigger arg0, JobExecutionContext arg1,
			CompletedExecutionInstruction arg2) {
		
		Trigger trigger= arg0;
		TriggerKey triggerKey = trigger.getKey();
		try {
			Scheduler scheduler = factory.getScheduler();
			logger.info("触发器监听器执行后，触发器是否存在"+scheduler.checkExists(triggerKey));
				
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void triggerFired(Trigger arg0, JobExecutionContext arg1) {
		logger.info("触发器监听器执行前");

	}

	@Override
	public void triggerMisfired(Trigger arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean vetoJobExecution(Trigger arg0, JobExecutionContext arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}
