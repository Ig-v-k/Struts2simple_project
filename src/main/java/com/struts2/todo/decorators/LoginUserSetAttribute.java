package com.struts2.todo.decorators;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserLogin;

public class LoginUserSetAttribute extends LoginDecorator {
	private HttpServletRequest request;
	private Map<String, Users> map;
	
	public LoginUserSetAttribute(MethodsToDoUserLogin methodsToDoUserLogin) {
		super(methodsToDoUserLogin);
	}
	
	public LoginUserSetAttribute(MethodsToDoUserLogin methodsToDoUserLogin, 
			HttpServletRequest request, 
			Map<String, Users> map) {
		super(methodsToDoUserLogin);
	}
	
	
	
	/*
	 * extends methods
	 */
	@Override
	public boolean descent(String username, String password) {
		return super.descent(username, password) ? this.setAttributeDB(this.request, this.map) : false;
	}

	public boolean setAttributeDB(HttpServletRequest request, Map<String, Users> map) {
		request.setAttribute("db", map);
		return true;
	}
}
