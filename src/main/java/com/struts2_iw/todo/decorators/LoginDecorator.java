package com.struts2_iw.todo.decorators;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.MethodsToDoUserLogin;

public class LoginDecorator implements MethodsToDoUserLogin{
	private MethodsToDoUserLogin methodsTodoUserLogin;
	private static final Logger LOGGER = Logger.getLogger(LoginDecorator.class.getName());
	
	public LoginDecorator(MethodsToDoUserLogin methodsToDoUserLogin) {
		LOGGER.info("--- LOGGER: constructor() ");
		this.methodsTodoUserLogin = methodsToDoUserLogin;
	}
	
	@Override
	public boolean descent(final String username, final String password) {
		LOGGER.info("--- LOGGER: method() ");
		return methodsTodoUserLogin.descent(username, password);
	}
}
