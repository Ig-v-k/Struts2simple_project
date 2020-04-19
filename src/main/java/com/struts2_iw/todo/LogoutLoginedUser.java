package com.struts2_iw.todo;

import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserLogout;
import com.struts2_iw.todo.decorators.LogoutDecorator;

public class LogoutLoginedUser extends LogoutDecorator implements CustomServletActionContext{
	public LogoutLoginedUser(MethodsToDoUserLogout doUserLogout) {
		super(doUserLogout);
	}
	
	@Override
	public void logoutUser() {
		my_session.removeAttribute("labelLogin_Register");
		my_session.removeAttribute("logined_registeredUSER");
		super.logoutUser();
	}
}
