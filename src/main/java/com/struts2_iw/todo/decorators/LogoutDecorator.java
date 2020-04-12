package com.struts2_iw.todo.decorators;

import javax.servlet.http.HttpServletRequest;

import com.struts2_iw.interfaces.MethodsToDoUserLogout;

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
