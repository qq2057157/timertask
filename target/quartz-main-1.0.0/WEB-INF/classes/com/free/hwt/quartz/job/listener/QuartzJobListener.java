package com.free.hwt.quartz.job.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuartzJobListener implements JobListener {
	
	StdSchedulerFactory factory = new StdSchedulerFactory();
	
	/**日志输出*/
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "QuartzJobListener";
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void jobToBeExecuted(JobExecutionContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void jobWasExecuted(JobExecutionContext arg0,
			JobExecutionException arg1) {
		Trigger trigger= arg0.getTrigger();
		TriggerKey triggerKey = trigger.getKey();
		try {
			Scheduler scheduler = factory.getScheduler();
			logger.info("任务执行完后，触发器是否存在"+scheduler.checkExists(triggerKey));
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
