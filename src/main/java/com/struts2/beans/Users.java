package com.struts2.beans;

import com.struts2.interfaces.MethodsTodoUser;

public class Users implements MethodsTodoUser<Users>{
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

	@Override
	public boolean descent(String username, String password) {
		if(this.username == username && this.password == password)
			return true;
		return false;
	}
}
