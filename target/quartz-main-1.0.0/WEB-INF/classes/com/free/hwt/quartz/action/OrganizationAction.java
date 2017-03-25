package com.free.hwt.quartz.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.free.hwt.quartz.model.OrganizationModel;
import com.free.hwt.quartz.model.UserModel;
import com.free.hwt.quartz.service.OrganizationService;

@Controller
@RequestMapping("timer/org")
public class OrganizationAction {
	
	@Autowired
	private OrganizationService organizationService;

	@RequestMapping("main")
	public String organizationMain(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel){
		
		return  organizationService.organizationMain(request, response, organizationModel);
	}
	
	@RequestMapping("add")
	public void addOrganization(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel){
		
		organizationService.addOrganization(request, response, organizationModel);
	}
	@RequestMapping("addAdmin")
	public void addAdministrator(HttpServletRequest request,HttpServletResponse response,UserModel userModel){
		
		organizationService.addOrganizationAdministrator(request, response, userModel);
	}
	
	@RequestMapping("disable")
	public void disableOrganization(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel){
		
		organizationService.disableOrganization(request, response, organizationModel);
	}

	@RequestMapping("enable")
	public void enableOrganization(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel){
		
		organizationService.enableOrganization(request, response, organizationModel);
	}
	
	@RequestMapping("delete")
	public void deleteTimerTask(HttpServletRequest request,HttpServletResponse response,OrganizationModel organizationModel){
		
		organizationService.deleteOrganization(request, response, organizationModel);
	}
}
