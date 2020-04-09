package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.decorators.LoginDecorator;

public class LoginValidateAction{
    private static final Logger LOGGER = Logger.getLogger(LoginValidateAction.class.getName());
    
	public String descentUser(final String userRole, final String username, final String password) {
		if(new LoginDecorator(
						new ImplMethodsLogin()).descent(userRole, username, password))
			return ActionsTexts.SUCCESS;
		return ActionsTexts.ERROR;
	}
}
