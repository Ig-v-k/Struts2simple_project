package com.struts2.todo.decorators;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.struts2.interfaces.MethodsToDoUserRegistration;

public class RegistrationUserToSession extends RegistrationDecorator implements SessionAware{		
	private String passwordRepeat = "";
	private Map<String, Object> session;
	
	public RegistrationUserToSession(MethodsToDoUserRegistration userRoleExtendingMethods, final String passwordRepeat) {
		super(userRoleExtendingMethods);
		this.passwordRepeat = passwordRepeat;
	}

	/* 
	 * main
	 */
	@Override
	public boolean putToDB(final String username, final String password, final String userRole) {
		if(password.equals(this.passwordRepeat)) {
			this.putToSession(username);
			return super.putToDB(username, password, userRole);
		}
		return false;
	}
	
	private void putToSession(final String username) {
		session.put("registeredUSER", username);
	}
	
	
	
	@Override
	public void setSession(final Map<String, Object> session) {
		this.session = session;	
	}
}
