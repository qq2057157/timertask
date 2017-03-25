package com.free.hwt.quartz.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import com.free.hwt.quartz.mapper.OrganizationMapper;
import com.free.hwt.quartz.mapper.UserMapper;
import com.free.hwt.quartz.model.OrganizationModel;
import com.free.hwt.quartz.model.TimerTaskModel;
import com.free.hwt.quartz.model.UserModel;
import com.free.hwt.quartz.service.OrganizationService;
import com.free.hwt.quartz.service.TimerTaskService;
import com.free.hwt.quartz.service.UserService;
import com.free.hwt.quartz.util.CommonCode;
import com.free.hwt.quartz.util.JsonCommon;
import com.free.hwt.quartz.util.QuartzParamUtil;
import com.free.hwt.quartz.util.UserRoleCode;
import com.free.hwt.quartz.util.UserStateCode;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	/**每页组织个数*/
	private static final Integer PAGE_SIZE = 6;
	
	/** 组织管理Service */
	@Autowired
	private OrganizationMapper organizationMapper;
	
	/** 任务管理Service */
	@Autowired
	private TimerTaskService timerTaskService;
	
	/** 用户管理Mapper */
	@Autowired
	private UserMapper userMapper;
	
	/** 用户管理Service */
	@Autowired
	private UserService userService;
	
	/** 多线程任务管理bean */
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	
	/** 日志记录 */
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void addOrganization(HttpServletRequest request,
			HttpServletResponse response, OrganizationModel organizationModel) {
		try {
			Integer addResult = organizationMapper.addOrganization(organizationModel);
			if (addResult>0) {
				logger.info("添加组织“"+organizationModel.getOrganization()+"”成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			} else {
				logger.info("添加组织“"+organizationModel.getOrganization()+"”失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (DuplicateKeyException e) {
			logger.info("添加组织“"+organizationModel.getOrganization()+"”失败，组织名或组织代码已存在");
			JsonCommon.outPutResultCodeJson(CommonCode.DUPLICATE, response);
			e.printStackTrace();
		} catch (Exception e) {
			logger.info("添加组织“"+organizationModel.getOrganization()+"”失败，未知的服务器异常");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}

	}

	@Override
	public void disableOrganization(HttpServletRequest request,
			HttpServletResponse response, OrganizationModel organizationModel) {
		try {
			organizationModel.setActionTime(new Timestamp(System.currentTimeMillis()));
			organizationModel.setStatus(QuartzParamUtil.ORGANIZATION_DISABLE);
			Integer updateResult = organizationMapper.updateOrganizationStatus(organizationModel);
			if (updateResult>0) {
				logger.info("封禁id为:"+organizationModel.getId()+"的组织成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			} else {
				logger.info("封禁id为:"+organizationModel.getId()+"的组织失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("封禁id为:"+organizationModel.getId()+"的组织失败，失败原因为服务器发生错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}

	}

	@Override
	public void enableOrganization(HttpServletRequest request,
			HttpServletResponse response, OrganizationModel organizationModel) {
		try {
			organizationModel.setActionTime(new Timestamp(System.currentTimeMillis()));
			organizationModel.setStatus(QuartzParamUtil.ORGANIZATION_NORMAL);
			Integer updateResult = organizationMapper.updateOrganizationStatus(organizationModel);
			if (updateResult>0) {
				logger.info("解禁id为:"+organizationModel.getId()+"的组织成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			} else {
				logger.info("解禁id为:"+organizationModel.getId()+"的组织失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("解禁id为:"+organizationModel.getId()+"的组织失败，失败原因为服务器发生错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}

	}

	@Override
	public void deleteOrganization(HttpServletRequest request,
			HttpServletResponse response, OrganizationModel organizationModel) {
		try {
			
			DeleteUser deleteUser = new DeleteUser(organizationModel.getOrganizationCode());
			
			taskExecutor.execute(deleteUser);
			
			Integer deleteResult = organizationMapper.deleteOrganization(organizationModel);
			if (deleteResult>0) {
				logger.info("删除id为:"+organizationModel.getId()+"的组织成功");
				JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
			} else {
				logger.info("删除id为:"+organizationModel.getId()+"的组织失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("删除id为:"+organizationModel.getId()+"的组织失败，失败原因为服务器发生错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}

	}

	@Override
	public void addOrganizationAdministrator(HttpServletRequest request,
			HttpServletResponse response,UserModel userModel) {
		try {
			userModel.setRole(UserRoleCode.ORG_ADMINISTRATOR);
			userModel.setStatus(UserStateCode.ENABLE);
			Integer addUserResult = userMapper.userRegister(userModel);
			if (addUserResult>0) {
				logger.info("组织“"+userModel.getOrganization()+"”的管理员id是:"+userModel.getId()+"成功");

				OrganizationModel organizationModel = new OrganizationModel();
				organizationModel.setAdministratorId(userModel.getId());
				organizationModel.setOrganizationCode(userModel.getOrganizationCode());
				organizationModel.setStatus(QuartzParamUtil.ORGANIZATION_NORMAL);
				organizationModel.setActionTime(new Timestamp(System.currentTimeMillis()));
				Integer addAdminResult = organizationMapper.setOrganizationAdmin(organizationModel);
				if(addAdminResult>0){
					logger.info("为组织“"+userModel.getOrganization()+"”添加管理员"+userModel.getUsername()+"成功");
					JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);

				} else {
					userMapper.deleteUser(userModel);
					logger.info("为组织“"+userModel.getOrganization()+"”添加管理员"+userModel.getUsername()+"失败");
					JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);

				}
				
			} else {
				logger.info("为组织“"+userModel.getOrganization()+"”添加管理员"+userModel.getUsername()+"失败");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			}
		} catch (Exception e) {
			logger.info("为组织“"+userModel.getOrganization()+"”添加管理员"+userModel.getUsername()+"失败，失败原因为未知的服务器错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}
	}

	@Override
	public String organizationMain(HttpServletRequest request,
			HttpServletResponse response, OrganizationModel organizationModel) {
		if(null==organizationModel.getPageSize() || organizationModel.getPageSize()==0)organizationModel.setPageSize(PAGE_SIZE);
		
		int totalCount = organizationMapper.getOrganizationCount();
	
		int totalPages = 0;
	
		if (totalCount % PAGE_SIZE == 0) {
			totalPages = totalCount / PAGE_SIZE;
		} else {
			totalPages = totalCount / PAGE_SIZE + 1;
		}
		int currentPage = 0;
		// 若当前页的页号小于等于0.则将其设置为0，否则将获取的页数*每页显示条数作为查询条件
		if(null==organizationModel.getCurrentPage() || organizationModel.getCurrentPage() <= 0){
			organizationModel.setCurrentPage(1);
			currentPage = 1;
		// 如果当前页数大于总页数,将其设置为总页数
		} else if (currentPage >= totalPages){
			currentPage = totalPages;
			organizationModel.setCurrentPage(totalPages);
		} else {
			currentPage = organizationModel.getCurrentPage();
		}

		logger.info("总记录数为:" + totalCount + ",每页显示条数为：" + PAGE_SIZE + ",总页数为:" + totalPages);
		organizationModel.setStart((currentPage-1)*PAGE_SIZE);

		List<OrganizationModel> organizationModels= organizationMapper.getAllOrganizationInfo(organizationModel);

		request.setAttribute("orgModels", organizationModels);
		request.setAttribute("sumNum", totalCount);
		request.setAttribute("pageSize", organizationModel.getPageSize());
		request.setAttribute("currentPage", organizationModel.getCurrentPage());
		
		return "WEB-INF/OrganizationManager";
	}
	class DeleteUser implements Runnable{
		private Integer organizationCode;

		DeleteUser(Integer organizationCode) {
			this.organizationCode = organizationCode;
		}
		@Override
		public void run() {
			List<UserModel> userModels= userMapper.getAllUserByOrgCode(organizationCode);
			for (UserModel userModel : userModels) {
				List<TimerTaskModel> timerTaskModels;
				try {
					timerTaskModels = timerTaskService.getAllTimerTaskInfo(userModel.getId());
					for (TimerTaskModel timerTaskModel : timerTaskModels) {
						timerTaskService.deleteTimerTask(timerTaskModel);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				userMapper.deleteUser(userModel);
			}	
			
		}
		
	}
	@Override
	public void checkOrgExist(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel) {
		try {
			
			OrganizationModel checkResult= organizationMapper.checkOrgExist(organizationModel);
		
			if (null==checkResult) {
				logger.info("组织"+organizationModel.getOrganization()+"不存在");
				JsonCommon.outPutResultCodeJson(CommonCode.FAIL, response);
			} else {
				if(checkResult.getStatus()==QuartzParamUtil.ORGANIZATION_DISABLE){
					logger.info("组织“"+organizationModel.getOrganization()+"存在,但此组织处于封禁状态，无法注册");
					JsonCommon.outPutResultCodeJson(CommonCode.DISABLE_ORGANIZATION, response);
				} else {
					logger.info("组织“"+organizationModel.getOrganization()+"存在");
					JsonCommon.outPutResultCodeJson(CommonCode.SUCCESS, response);
	
				}
			}
		} catch (Exception e) {
			logger.info("查询组织“"+organizationModel.getOrganization()+"失败，失败原因为未知的服务器错误");
			JsonCommon.outPutResultCodeJson(CommonCode.SERVER_ERROR, response);
			e.printStackTrace();
		}
	}

}
