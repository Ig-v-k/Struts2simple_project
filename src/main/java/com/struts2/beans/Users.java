package com.struts2.beans;

public class Users {
	private String username;
	private String password;
	private String userRole;
	
	public Users() {
		this.username = "";
		this.password = "";
		this.userRole = "";
	}
	
	public Users(final String username, final String password, final String userRole) {
		this.username = username;
		this.password = password;
		this.userRole = userRole;
	}
	
	public void conformity() {};
}
