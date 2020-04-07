package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.action.LoginControllerAction;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCard;

public class ImplMethodsCard implements MethodsToDoUserCard, CustomServletActionContext{
	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	
	@Override
	public void methodToDoCard() {
		my_request.setAttribute("cardContent", true);
	}
}
