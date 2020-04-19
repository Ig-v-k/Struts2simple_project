package com.struts2_iw.interfaces.impl;

import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserLogout;

public class ImplMethodsLogout implements MethodsToDoUserLogout, CustomServletActionContext{
	
	@Override
	public void logoutUser() {
		my_request.setAttribute("logoutUSER", my_session.getAttribute("USER"));
		my_request.getSession().invalidate();
	}
	
}
