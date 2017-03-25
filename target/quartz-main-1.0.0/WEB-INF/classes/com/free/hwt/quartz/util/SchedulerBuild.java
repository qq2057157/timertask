package com.free.hwt.quartz.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Description: 调度器Scheduler工具类
 * @created by Hu_wentao
 * @2016-1-14
 * @version V1.0.0
 */
public class SchedulerBuild{

	private static Scheduler sched;

	/**
	 * @Description:根据传入的Scheduler名创建Scheduler
	 * @author Hu_wentao
	 * @date 2014-10-10
	 * @param 
	 * @return void
	 */
	public Scheduler getScheduler(String schedId){

		
		StdSchedulerFactory factory = new StdSchedulerFactory();
		Properties props = new Properties();
		
		try {
			InputStream in = this.getClass().getClassLoader().getResourceAsStream("env/quartz.properties");
			props.load(in);
			props.setProperty("org.quartz.scheduler.instanceName", schedId);
			props.setProperty("org.quartz.threadPool.threadCount", "10");
		
			factory.initialize(props);
			sched = factory.getScheduler();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		return sched;
	}
}
