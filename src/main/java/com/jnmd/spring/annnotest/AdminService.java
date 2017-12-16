package com.jnmd.spring.annnotest;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	
	@Resource(name="adminDao")
	//@Autowired	//　自动装配(按名称，按类型)
	private AdminDAO adminDAO;

	public void login(String name, String password){
		adminDAO.login(name, password);
	}
	
	public void addLeague(){
		adminDAO.addLeague();
	}
	
}
