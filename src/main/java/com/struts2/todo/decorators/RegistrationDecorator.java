package com.struts2.todo.decorators;

import com.struts2.interfaces.MethodsToDoUserRegistration;

public class RegistrationDecorator implements MethodsToDoUserRegistration {
	private MethodsToDoUserRegistration methodsToDoUserRegistration;
	public RegistrationDecorator(MethodsToDoUserRegistration userRoleExtendingMethods) {
		this.methodsToDoUserRegistration = userRoleExtendingMethods;
	}
	
	
	@Override
	public boolean putToDB(String username, String password, String userRole) {
		return this.methodsToDoUserRegistration.putToDB(username, password, userRole);	
	}
	
	
}