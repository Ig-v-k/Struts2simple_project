package com.struts2_iw.todo.decorators;

import java.util.logging.Logger;

import com.struts2_iw.action.LoginPostAction;
import com.struts2_iw.interfaces.MethodsToDoUserRegistration;

public class RegistrationDecorator implements MethodsToDoUserRegistration {
	private static final Logger LOGGER = Logger.getLogger(RegistrationDecorator.class.getName());
	private MethodsToDoUserRegistration methodsToDoUserRegistration;
	
	public RegistrationDecorator(MethodsToDoUserRegistration userRoleExtendingMethods) {
		this.methodsToDoUserRegistration = userRoleExtendingMethods;
	}
	
	
	@Override
	public boolean putToDB(String username, String password, String userRole) {
		return this.methodsToDoUserRegistration.putToDB(username, password, userRole);	
	}
	
	
}