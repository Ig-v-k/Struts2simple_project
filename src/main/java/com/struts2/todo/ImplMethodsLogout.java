package com.struts2.todo;

import javax.servlet.http.HttpServletRequest;

import com.struts2.interfaces.MethodsToDoUserLogout;

public class ImplMethodsLogout implements MethodsToDoUserLogout{
	
	@Override
	public void logoutUser(HttpServletRequest httpServletRequest) {
		httpServletRequest.getSession().invalidate();
	}
	
}
