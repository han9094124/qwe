package com.jnmd.spring.annnotest;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller
/*@Namespace("/admin")
@ParentPackage("struts-default")
@Action("addLeagueAction")
@Results({
	@Result(name="", location=""),
	@Result(name="", location="")
})*/
public class AddLeagueAction /*extends ActionSupport*/{

	//@Resource(name="adminService")
	@Resource
	private AdminService adminService;
	
	public String execute(){
		
		adminService.addLeague();
		
		return "success";
	
	}
	
}
