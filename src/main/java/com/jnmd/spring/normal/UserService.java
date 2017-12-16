package com.jnmd.spring.normal;

public class UserService {
	
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(){
		//UserDAO dao = new UserDAO();
		//dao = new UserDAO();
		userDAO.addUser();
		
		System.out.println("Service addUser method...");
	}

	public void updateUser(){
		//UserDAO dao = new UserDAO();
		//dao = new UserDAO();
		userDAO.updateUser();
		
		System.out.println("Service updateUser method...");
	}
	
}
