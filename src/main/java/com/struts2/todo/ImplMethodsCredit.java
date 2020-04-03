package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.action.LoginControllerAction;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCredit;

public class ImplMethodsCredit implements MethodsToDoUserCredit, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	
	@Override
	public void methodToDoCredit() {
		my_request.setAttribute("userCreditContent", true);
	}
}
