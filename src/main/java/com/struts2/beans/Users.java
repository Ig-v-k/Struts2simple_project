package com.struts2.beans;

import com.struts2.todo.UserRole;

public class Users {
	private String username = null;
	private String password = null;
	private UserRole userRole;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	
	public Users(String username, String password, UserRole userRole) {
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}
	
//	public void setUserRole(UserRole userRole) {
//		this.userRole = userRole;
//	}
	
	public UserRole getUserRole() {
		return userRole;
	}
	
//	public void setUsername(String username) {
//		this.username = username;
//	}
	
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}
