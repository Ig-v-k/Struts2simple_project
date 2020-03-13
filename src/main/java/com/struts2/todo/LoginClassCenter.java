package com.struts2.todo;

import com.struts2.interfaces.MethodsToDoUserLogin;

public class LoginClassCenter implements MethodsToDoUserLogin{
	private MethodsToDoUserLogin methodsTodoUserLogin;
	
	public LoginClassCenter(MethodsToDoUserLogin methodsToDoUserLogin) {
		this.methodsTodoUserLogin = methodsToDoUserLogin;
	}
	
	@Override
	public boolean descent(String username, String password) {
		return methodsTodoUserLogin.descent(username, password);
	}
}
