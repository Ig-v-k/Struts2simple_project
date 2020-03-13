package com.struts2.todo;

import com.struts2.interfaces.MethodsToDoUserRegistration;

public class RegistrationUserToSession extends RegistrationClassCenter{		
	private String passwordRepeat = "";
	public RegistrationUserToSession(MethodsToDoUserRegistration userRoleExtendingMethods, final String passwordRepeat) {
		super(userRoleExtendingMethods);
		this.passwordRepeat = passwordRepeat;
	}

	
	@Override
	public boolean putToDB(final String username, final String password, final String userRole) {
		return this.passwordRepeatVer(password, this.passwordRepeat);
	}
	public boolean passwordRepeatVer(final String password, final String passwordRepeat) {
		return password.equals(passwordRepeat) ? true : false;
	}
	
	
}
