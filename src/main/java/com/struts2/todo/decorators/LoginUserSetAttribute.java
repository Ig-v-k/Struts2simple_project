package com.struts2.todo.decorators;

import java.util.logging.Logger;

import com.struts2.interfaces.MethodsToDoUserLogin;
import com.struts2.todo.ClassValidateUserIn;

public class LoginUserSetAttribute extends LoginDecorator {
	private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
	
	public LoginUserSetAttribute(MethodsToDoUserLogin methodsToDoUserLogin) {
		super(methodsToDoUserLogin);
		LOGGER.info("--- LOGGER: constructor()");
	}
	
	
	/*
	 * extends methods
	 */
	@Override
	public boolean descent(final String username, final String password) {
		LOGGER.info("--- LOGGER: method - descent()");
		return super.descent(username, password);
	}
	
}
