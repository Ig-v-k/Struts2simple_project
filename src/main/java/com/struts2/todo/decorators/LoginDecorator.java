package com.struts2.todo.decorators;

import com.struts2.interfaces.MethodsToDoUserLogin;

public class LoginDecorator implements MethodsToDoUserLogin{
	private MethodsToDoUserLogin methodsTodoUserLogin;
	
	public LoginDecorator(MethodsToDoUserLogin methodsToDoUserLogin) {
		this.methodsTodoUserLogin = methodsToDoUserLogin;
	}
	
	@Override
	public boolean descent(String username, String password) {
		return methodsTodoUserLogin.descent(username, password);
	}
}
