package com.struts2_iw.todo.decorators;

import com.struts2_iw.interfaces.MethodsToDoUserLogin;

public class LoginDecorator implements MethodsToDoUserLogin{
	private MethodsToDoUserLogin methodsTodoUserLogin;
//	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	
	public LoginDecorator(MethodsToDoUserLogin methodsToDoUserLogin) {
		this.methodsTodoUserLogin = methodsToDoUserLogin;
	}
	
	@Override
	public String descent(final String userRole, final String username, final String password) {
		return methodsTodoUserLogin.descent(userRole, username, password);
	}
}
