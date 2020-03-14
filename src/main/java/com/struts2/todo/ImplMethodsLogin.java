package com.struts2.todo;

import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserLogin;

public class ImplMethodsLogin implements MethodsToDoUserLogin{
	private String userRole = MethodsToDoUserLogin.userRole;
	private Map<String, Users> usersDB;
	public ImplMethodsLogin() {}
	
	public ImplMethodsLogin(final String userRole) {
		this.userRole = userRole;
	}
	
	
	@Override
	public boolean descent(final String username, final String password) {
		usersDB = ClassInitDB.getRepositoryUsers().returnMapUsers(this.userRole);
		return username.equals(usersDB.get(this.userRole).getP_U(username))
				&& password.equals(usersDB.get(this.userRole).getP_U(password)) ? true : false;
	}
}
