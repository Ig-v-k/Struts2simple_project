package com.struts2_iw.interfaces.impl;

import javax.servlet.http.HttpServletRequest;

import com.struts2_iw.interfaces.MethodsToDoUserLogout;

public class ImplMethodsLogout implements MethodsToDoUserLogout{
	
	@Override
	public void logoutUser(HttpServletRequest httpServletRequest) {
		httpServletRequest.setAttribute("logoutUSER", httpServletRequest.getSession().getAttribute("USER"));
		httpServletRequest.getSession().invalidate();
	}
	
}
