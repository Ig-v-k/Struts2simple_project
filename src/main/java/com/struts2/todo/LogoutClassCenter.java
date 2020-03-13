package com.struts2.todo;

import javax.servlet.http.HttpServletRequest;

import com.struts2.interfaces.MethodsToDoUserLogout;

public class LogoutClassCenter implements MethodsToDoUserLogout{
	private MethodsToDoUserLogout methodsToDoUserLogout;
	
	public LogoutClassCenter(MethodsToDoUserLogout methodsToDoUserLogout) {
		this.methodsToDoUserLogout = methodsToDoUserLogout;
	}
	
	@Override
	public void logoutUser(HttpServletRequest httpServletRequest) {
		this.methodsToDoUserLogout.logoutUser(httpServletRequest);
	}
}
