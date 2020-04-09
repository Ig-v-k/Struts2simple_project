package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.action.LoginControllerAction;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserTransfer;

public class ImplMethodsTransfer implements MethodsToDoUserTransfer, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ImplMethodsTransfer.class.getName());
	
	@Override
	public void methodToDoTransfer() {
		LOGGER.info("--- LOGGER: method");
		my_request.setAttribute("transferContent", true);
	}
}
