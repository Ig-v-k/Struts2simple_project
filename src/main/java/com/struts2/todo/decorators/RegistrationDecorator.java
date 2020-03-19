package com.struts2.todo.decorators;

import java.util.logging.Logger;

import com.struts2.action.LoginControllerToDoAction;
import com.struts2.interfaces.MethodsToDoUserRegistration;

public class RegistrationDecorator implements MethodsToDoUserRegistration {
	private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private MethodsToDoUserRegistration methodsToDoUserRegistration;
	
	public RegistrationDecorator(MethodsToDoUserRegistration userRoleExtendingMethods) {
		LOGGER.info("--- LOGGER: <-- constructor -->");
		this.methodsToDoUserRegistration = userRoleExtendingMethods;
	}
	
	
	@Override
	public boolean putToDB(String username, String password, String userRole) {
		LOGGER.info("--- LOGGER: <-- method -->");
		return this.methodsToDoUserRegistration.putToDB(username, password, userRole);	
	}
	
	
}