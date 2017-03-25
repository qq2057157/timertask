package com.free.hwt.quartz.job.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/** 
 * @Description:QuartzSchedulerInitListener.java
 * @author  huwentao 
 * @date 创建时间：2016年2月17日 下午3:13:24 
 * @version 1.0  
 */
public class QuartzSchedulerInitListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		/** Scheduler工厂 */
		StdSchedulerFactory factory = new StdSchedulerFactory();
		try {
			Scheduler scheduler = factory.getScheduler();
			scheduler.start();
			scheduler.resumeAll();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
