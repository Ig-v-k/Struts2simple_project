package com.struts2.todo.decorators;

import org.apache.struts2.ServletActionContext;

import com.struts2.interfaces.MethodsToDoUserRegistration;

public class RegistrationUserToSession extends RegistrationDecorator {		
	private String passwordRepeat = "";
	
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
		ServletActionContext.getRequest().getSession().setAttribute("USER", username);
	}
	
}
