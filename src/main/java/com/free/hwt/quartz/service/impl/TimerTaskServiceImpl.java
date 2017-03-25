package com.free.hwt.quartz.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.free.hwt.quartz.mapper.TimerTaskMapper;
import com.free.hwt.quartz.model.TimerTaskModel;
import com.free.hwt.quartz.service.QuartzService;
import com.free.hwt.quartz.service.TimerTaskService;
import com.free.hwt.quartz.util.CommonCode;
import com.free.hwt.quartz.util.JsonCommon;
import com.free.hwt.quartz.util.QuartzParamUtil;
import com.free.hwt.quartz.util.UserInfoEnum;

@Service
public class TimerTaskServiceImpl implements TimerTaskService {

	/**
	 * 日志记录
	 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * quartz定时任务service 
	 */
	@Autowired
	private QuartzService quartzService;
	
	/**
	 * 定时任务mapper
	 */
	@Autowired
	private TimerTaskMapper timerTaskMapper;
	
	/**每页显示任务数*/
	private static final Integer PAGE_SIZE = 6;
	
	/**
	 * 添加定时任务到数据库
	 * @param response
	 * @param request
	 * @param taskModel
	 */
	@Override
	public void addTimerTask(HttpServletResponse response,HttpServletRequest request,TimerTaskModel timerTaskModel) {
		Integer orgCode = (Integer)request.getSession().getAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue());
		
		Integer userId = (Integer)request.getSession().getAttribute(UserInfoEnum.USER_ID.getValue());
		
		String userName = (String)request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue());

		timerTaskModel.setUserId(userId);
		//设置任务名和任务组名
		timerTaskModel.setJobName(getJobName(timerTaskModel,orgCode));
		timerTaskModel.setJobGroup(QuartzParamUtil.JOB_GROUP_PREFIX+orgCode);
		//logger.info("开始时间是"+timerTaskModel.getStartTime().toString());
		//设置触发器名和触发器组名
		timerTaskModel.setTriggerName(getTriggerName(timerTaskModel,orgCode));
		timerTaskModel.setTriggerGroup(QuartzParamUtil.TRIGGER_GROUP_PREFIX+orgCode);

		timerTaskModel.setStatus(QuartzParamUtil.UN_SCHEDULED);
		try {
			int insertResult = timerTaskMapper.addTimerTask(timerTaskModel);
			if(insertResult>0){
				logger.info("用户"+userName+"新增定时任务"+timerTaskModel.getJobName()+"成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			}else {
				logger.info("用户"+userName+"新增定时任务"+timerTaskModel.getJobName()+"失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("用户"+userName+"新增定时任务"+timerTaskModel.getJobName()+"失败,失败原因为"+CommonCode.getMessage(CommonCode.SERVER_ERROR));
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}
	}
	

	
	/**
	 * 开始执行定时任务
	 * @param response
	 * @param request
	 * @param taskModel
	 */
	@Override
	public void startTimerTask(HttpServletResponse response,
			HttpServletRequest request, TimerTaskModel taskModel) {
		
		String userName = (String)request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue());
		
		Integer orgCode = (Integer)request.getSession().getAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue());

		try {
			if(null==taskModel.getId() || 0==taskModel.getId()){
				taskModel.setJobName(getJobName(taskModel,orgCode));
			}
			TimerTaskModel timerTaskModel = timerTaskMapper.getTimerTaskInfo(taskModel);
			
			if(null!=timerTaskModel){
					
				quartzService.scheduleTask(timerTaskModel, response, request);
				
				boolean result = quartzService.checkTaskIsScheduld(timerTaskModel);
				
				if(result){
					timerTaskModel.setStatus(QuartzParamUtil.SCHEDULED);
					timerTaskMapper.modifyJobStatus(timerTaskModel);
					JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
				} else {
					JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
				}
			}else {
				logger.info("用户"+userName+"启动id为"+taskModel.getId()+"的定时任务失败,失败原因为数据库中未查到此任务的信息");
				JsonCommon.outPutResultCodeJson(CommonCode.MISSING_PARAMS, response);
			}
		} catch (Exception e) {
			logger.info("用户"+userName+"启动id为"+taskModel.getId()+"的定时任务失败,失败原因为"+CommonCode.getMessage(CommonCode.SERVER_ERROR));
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}

	}

	/**
	 * 停止定时任务
	 * @param response
	 * @param request
	 * @param taskModel
	 */
	@Override
	public void stopTimerTask(HttpServletRequest request, HttpServletResponse response, TimerTaskModel timerTaskModel) {
		
		String userName = (String)request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue());
		Integer orgCode = (Integer)request.getSession().getAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue());

		try {
			if(null==timerTaskModel.getId() || 0==timerTaskModel.getId()){
				timerTaskModel.setJobName(getJobName(timerTaskModel,orgCode));
			}
			TimerTaskModel taskModel = timerTaskMapper.getTimerTaskInfo(timerTaskModel);
			
			if(null!=taskModel ){
				if(quartzService.unScheduleTask(taskModel)){
					logger.info("用户"+userName+"成功终止id为"+timerTaskModel.getId()+"的定时任务");
					JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
				}
			}else {
				logger.info("用户"+userName+"终止id为"+timerTaskModel.getId()+"的定时任务失败,失败原因为数据库中未查到此任务的信息");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("用户"+userName+"终止id为"+timerTaskModel.getId()+"的定时任务失败,失败原因为"+CommonCode.getMessage(CommonCode.SERVER_ERROR));
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}
	}
	
	/**
	 * 删除定时任务
	 * @param response
	 * @param request
	 * @param taskModel
	 */
	@Override
	public void deleteTimerTask(HttpServletRequest request,
		
		HttpServletResponse response, TimerTaskModel timerTaskModel) {
		String userName = (String)request.getSession().getAttribute(UserInfoEnum.USER_NAME.getValue());
		Integer orgCode = (Integer)request.getSession().getAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue());

		try {
			if(null==timerTaskModel.getId() || 0==timerTaskModel.getId()){
				timerTaskModel.setJobName(getJobName(timerTaskModel,orgCode));
			}
			int deleteResult = timerTaskMapper.deleteTimerTask(timerTaskModel);
			if(deleteResult>0){
				logger.info("用户"+"删除定时任务"+timerTaskModel.getId()+"成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			}else {
				logger.info("用户"+userName+"删除id为"+timerTaskModel.	getId()+"的定时任务失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("用户"+userName+"删除id为"+timerTaskModel.getId()+"的定时任务失败，失败原因为"+CommonCode.getMessage(CommonCode.SERVER_ERROR));
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}
	}

	/**
	 * 取得定时任务的名称，格式为:JOB_任务名_组织名称
	 * @param timerTaskModel
	 * @param orgCode
	 * @return
	 */
	private String getJobName(TimerTaskModel timerTaskModel,Integer orgCode){
		return QuartzParamUtil.JOB_PREFIX+timerTaskModel.getJobName() +QuartzParamUtil.UNDERLINE+ orgCode;
	}
	
	/**
	 * 取得触发器的名称，格式为:TIGGER_触发器名_组织名称
	 * @param timerTaskModel
	 * @param orgCode
	 * @return
	 */
	private String getTriggerName(TimerTaskModel timerTaskModel,Integer orgCode){
		return QuartzParamUtil.TRIGGER_PREFIX+timerTaskModel.getTriggerName()+QuartzParamUtil.UNDERLINE +orgCode;
	}



	@Override
	public String getAllTimerTaskInfoByPage(HttpServletRequest request,
			HttpServletResponse response, TimerTaskModel timerTaskModel) {
		Integer userId = (Integer)request.getSession().getAttribute(UserInfoEnum.USER_ID.getValue());
		Integer userRole = (Integer)request.getSession().getAttribute(UserInfoEnum.USER_ROLE.getValue());
		Integer orgCode = (Integer)request.getSession().getAttribute(UserInfoEnum.ORGANIZATION_CODE.getValue());
		timerTaskModel.setUserId(userId);
		timerTaskModel.setUserRole(userRole);
		timerTaskModel.setOrganizationCode(orgCode);

		if(null==timerTaskModel.getPageSize() || timerTaskModel.getPageSize()==0)timerTaskModel.setPageSize(PAGE_SIZE);
		
		int totalCount = timerTaskMapper.getAllTimerTaskCount(timerTaskModel);
	
		int totalPages = 0;
	
		if (totalCount % PAGE_SIZE == 0) {
			totalPages = totalCount / PAGE_SIZE;
		} else {
			totalPages = totalCount / PAGE_SIZE + 1;
		}
		int currentPage = 0;
		// 若当前页的页号小于等于0.则将其设置为0，否则将获取的页数*每页显示条数作为查询条件
		if(null==timerTaskModel.getCurrentPage() || timerTaskModel.getCurrentPage() <= 0){
			timerTaskModel.setCurrentPage(1);
			currentPage = 1;
		// 如果当前页数大于总页数,将其设置为总页数
		} else if (currentPage >= totalPages){
			currentPage = totalPages;
			timerTaskModel.setCurrentPage(totalPages);
		} else {
			currentPage = timerTaskModel.getCurrentPage();
		}

		logger.info("总记录数为:" + totalCount + ",每页显示条数为：" + PAGE_SIZE + ",总页数为:" + totalPages);
		timerTaskModel.setStart((currentPage-1)*PAGE_SIZE);

		List<TimerTaskModel> timerTaskModels= timerTaskMapper.getAllTimerTaskInfoByPage(timerTaskModel);
		
		for (TimerTaskModel timerTaskModel2 : timerTaskModels) {
			if(timerTaskModel2.getStatus()==1 && !quartzService.checkTaskIsScheduld(timerTaskModel2)){
				timerTaskModel2.setStatus(QuartzParamUtil.INVALID_TASK);
				timerTaskMapper.modifyJobStatus(timerTaskModel2);
			}
		}
		request.setAttribute("timerTasks", timerTaskModels);
		request.setAttribute("sumNum", totalCount);
		request.setAttribute("pageSize", timerTaskModel.getPageSize());
		request.setAttribute("currentPage", timerTaskModel.getCurrentPage());

		return "WEB-INF/TimerTaskManager";
	}



	@Override
	public void deleteTimerTask(TimerTaskModel timerTaskModel) throws Exception{
		try {
			quartzService.unScheduleTask(timerTaskModel);
			timerTaskMapper.deleteTimerTask(timerTaskModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	@Override
	public List<TimerTaskModel> getAllTimerTaskInfo(Integer userId) throws Exception{
		 
		return timerTaskMapper.getAllTimerTaskInfo(userId);
	}
}
