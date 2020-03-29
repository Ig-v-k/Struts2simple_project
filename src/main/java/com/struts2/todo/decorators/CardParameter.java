package com.struts2.todo.decorators;

import java.util.logging.Logger;

import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCard;
import com.struts2.todo.ClassValidateUserIn;

public class CardParameter extends CardDecorator implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
	
	public CardParameter(MethodsToDoUserCard methodsToDoUserCard) {
		super(methodsToDoUserCard);
	}
	
	
	/*
	 * extends methods
	 */
	@Override
	public String TextAction() {
		LOGGER.info("--- LOGGER: my_request.getParameter(\"actionCard\") -> " + my_request.getParameter("actionCard"));
		if(my_request.getParameter("actionCard") != null)
			this.actionOfParameters();
		return super.TextAction();
	}
	
	private void actionOfParameters() {
		if(my_request.getParameter("actionCard").equals("edit")) {
			my_request.setAttribute("editFormCard", true);
		}
	}
}
