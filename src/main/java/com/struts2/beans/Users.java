package com.struts2.beans;

public class Users {
	private String username = null;
	private String password = null;
	private String userRole = null;
	
	public Users() {}
	
	public Users(String username, String password, String userRole) {
		this.setUsername(username);
		this.setPassword(password);
		this.setUserRole(userRole.toString());
	}
	
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	public String getUserRole() {
		return userRole;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
}
