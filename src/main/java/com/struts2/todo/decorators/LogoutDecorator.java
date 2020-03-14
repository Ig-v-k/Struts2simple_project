package com.struts2.todo.decorators;

import javax.servlet.http.HttpServletRequest;

import com.struts2.interfaces.MethodsToDoUserLogout;

public class LogoutDecorator implements MethodsToDoUserLogout{
	private MethodsToDoUserLogout methodsToDoUserLogout;
	
	public LogoutDecorator(MethodsToDoUserLogout methodsToDoUserLogout) {
		this.methodsToDoUserLogout = methodsToDoUserLogout;
	}
	
	@Override
	public void logoutUser(HttpServletRequest httpServletRequest) {
		this.methodsToDoUserLogout.logoutUser(httpServletRequest);
	}
}
