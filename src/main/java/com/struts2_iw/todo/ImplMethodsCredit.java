package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.action.LoginControllerAction;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserCredit;

public class ImplMethodsCredit implements MethodsToDoUserCredit, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ImplMethodsCredit.class.getName());
	
	@Override
	public void methodToDoCredit() {
		LOGGER.info("--- LOGGER: method");
		my_request.setAttribute("creditsContent", true);
		my_request.setAttribute("userCreditContent", true);
	}
}
