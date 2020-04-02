package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.action.LoginControllerAction;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserTransfer;

public class ImplMethodsTransfer implements MethodsToDoUserTransfer, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	
	@Override
	public void methodToDo() {
		my_request.setAttribute("userTransferContent", true);
	}
}
