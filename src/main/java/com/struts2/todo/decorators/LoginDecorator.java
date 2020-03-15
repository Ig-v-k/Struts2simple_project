package com.struts2.todo.decorators;

import java.util.logging.Logger;

import com.struts2.action.LoginControllerToDoAction;
import com.struts2.interfaces.MethodsToDoUserLogin;

public class LoginDecorator implements MethodsToDoUserLogin{
	private MethodsToDoUserLogin methodsTodoUserLogin;
	private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	
	public LoginDecorator(MethodsToDoUserLogin methodsToDoUserLogin) {
		this.methodsTodoUserLogin = methodsToDoUserLogin;
		LOGGER.info("--- LOGGER: constructor()");
	}
	
	@Override
	public boolean descent(final String username, final String password) {
		LOGGER.info("--- LOGGER: method - descent()");
		return methodsTodoUserLogin.descent(username, password);
	}
}
