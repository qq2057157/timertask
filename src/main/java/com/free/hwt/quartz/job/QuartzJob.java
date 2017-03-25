package com.free.hwt.quartz.job;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.free.hwt.quartz.mapper.TimerTaskMapper;
import com.free.hwt.quartz.util.QuartzParamUtil;

/** 
 * @Description:Quartz任务类
 * @author  huwentao 
 * @date 创建时间：2016年2月1日 下午2:37:36 
 * @version 1.0  
 */
public class QuartzJob implements Job {

	
	private TimerTaskMapper taskMapper;

	/**日志输出*/
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		
		JobDetail job =context.getJobDetail();
		JobDataMap dataMap= job.getJobDataMap();
		JobKey jobKey = job.getKey();
		logger.info("任务"+jobKey.getName()+"在"+new Date(System.currentTimeMillis()).toString()+"执行了");
		logger.info("任务的目标请求是："+dataMap.get(QuartzParamUtil.TARGET_URL));
		//TimerTaskModel timerTaskModel = new TimerTaskModel();
		//timerTaskModel.setId(4);
		//timerTaskModel = taskMapper.getTimerTaskInfo(timerTaskModel);
		
		//logger.info("任务的组名是"+timerTaskModel.getJobGroup());
		 CloseableHttpClient httpclient = HttpClients.createDefault();
		 if(null==dataMap.get(QuartzParamUtil.TARGET_URL_METHOD) || dataMap.get(QuartzParamUtil.TARGET_URL_METHOD).toString().equals("get")){
			 HttpGet httpGet = new HttpGet(dataMap.get(QuartzParamUtil.TARGET_URL).toString());
	            //httpGet.setParams(params);
	            CloseableHttpResponse response1;
				try {
		            // The underlying HTTP connection is still held by the response object
		            // to allow the response content to be streamed directly from the network socket.
		            // In order to ensure correct deallocation of system resources
		            // the user MUST call CloseableHttpResponse#close() from a finally clause.
		            // Please note that if response content is not fully consumed the underlying
		            // connection cannot be safely re-used and will be shut down and discarded
		            // by the connection manager.
					response1 = httpclient.execute(httpGet);
					try {
							logger.info("任务执行结果状态码是："+response1.getStatusLine().toString());
							
			                HttpEntity entity1 = response1.getEntity();
			                // do something useful with the response body
			                // and ensure it is fully consumed
			                EntityUtils.consume(entity1);
			                logger.info(entity1.toString());
			            } finally {
			                response1.close();
			            }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	           
		 } else {
			 
	        try {
	            HttpPost httpPost = new HttpPost(dataMap.get(QuartzParamUtil.TARGET_URL).toString());
	            List <NameValuePair> nvps = new ArrayList <NameValuePair>();
	           
	            dataMap.remove(QuartzParamUtil.TARGET_URL);
	            dataMap.remove(QuartzParamUtil.TARGET_URL_METHOD);
	            for ( Map.Entry<String, Object> entry:dataMap.entrySet()) {

	            	nvps.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
	    			logger.info("参数是"+entry.getKey()+":"+entry.getValue());
	    		}
	    		
	            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
	            CloseableHttpResponse response2 = httpclient.execute(httpPost);

	            try {
	            	logger.info("任务执行结果状态码是："+response2.getStatusLine().toString());
	            	logger.info(response2.toString());

	                HttpEntity entity2 = response2.getEntity();
	                // do something useful with the response body
	                // and ensure it is fully consumed
	                EntityUtils.consume(entity2);
	            } finally {
	                response2.close();
	            }
	        } catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
	            try {
					httpclient.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		 }
	}
	
	public TimerTaskMapper getTaskMapper() {
		return taskMapper;
	}
	
	@Autowired
	public void setTaskMapper(TimerTaskMapper taskMapper) {
		this.taskMapper = taskMapper;
	}

}
