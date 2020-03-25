package com.struts2.todo.decorators;

import java.util.logging.Logger;

import com.struts2.action.LoginControllerAction;
import com.struts2.interfaces.MethodsToDoUserLogin;

public class LoginDecorator implements MethodsToDoUserLogin{
	private MethodsToDoUserLogin methodsTodoUserLogin;
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	
	public LoginDecorator(MethodsToDoUserLogin methodsToDoUserLogin) {
		this.methodsTodoUserLogin = methodsToDoUserLogin;
	}
	
	@Override
	public boolean descent(final String username, final String password) {
		return methodsTodoUserLogin.descent(username, password);
	}
}
