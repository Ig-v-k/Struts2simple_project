package com.struts2_iw.beans;

public class User {
	private String userName;
	private String password;
	private String userRole;
	
	public User() {
		this.userName = "";
		this.password = "";
		this.userRole = "";
	}
	
	public User(final String username, final String password, final String userRole) {
		this.userName = username;
		this.password = password;
		this.userRole = userRole;
	}
	
	public boolean equals_PU(final String username, final String password) {
		if (!"".equals(this.userName) && !"".equals(this.password)) {
			if (username.equals(this.userName) && password.equals(this.password))
				return true;
		}
		return false;
	}
	
	public String getUserName() {
		return this.userName;
	}

	@Override
	public String toString() {
		return "[" + this.userName + ":" + this.password + ":" + this.userRole + "]";
	}
}
