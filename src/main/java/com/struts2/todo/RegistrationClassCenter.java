package com.struts2.todo;

import com.struts2.interfaces.MethodsToDoUserRegistration;

public class RegistrationClassCenter implements MethodsToDoUserRegistration {
	private MethodsToDoUserRegistration methodsToDoUserRegistration;
	public RegistrationClassCenter(MethodsToDoUserRegistration userRoleExtendingMethods) {
		this.methodsToDoUserRegistration = userRoleExtendingMethods;
	}
	
	
	@Override
	public boolean putToDB(String username, String password, String userRole) {
		return this.methodsToDoUserRegistration.putToDB(username, password, userRole);	
	}
	
	
}