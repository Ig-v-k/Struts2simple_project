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
	
	public boolean equals_PU(final String username, final String password) {
		if(username.equals(this.username) && password.equals(this.password))
			return true;
		return false;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	@Override
	public String toString() {
		return "[" + this.username + ":" + this.password + ":" + this.userRole + "]";
	}
}
