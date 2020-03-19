package com.struts2.todo.decorators;

import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;

import com.struts2.action.LoginControllerToDoAction;
import com.struts2.interfaces.MethodsToDoUserRegistration;

public class RegistrationUserToSession extends RegistrationDecorator {		
	private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private String passwordRepeat = "";
	
	public RegistrationUserToSession(MethodsToDoUserRegistration userRoleExtendingMethods, final String passwordRepeat) {
		super(userRoleExtendingMethods);
		LOGGER.info("--- LOGGER: <-- constructor -->");
		this.passwordRepeat = passwordRepeat;
	}

	/* 
	 * main
	 */
	@Override
	public boolean putToDB(final String username, final String password, final String userRole) {
		LOGGER.info("--- LOGGER: <-- method -->");
		if(password.equals(this.passwordRepeat)) {
			this.putToSession(username);
			return super.putToDB(username, password, userRole);
		}
		return false;
	}
	
	private void putToSession(final String username) {
		LOGGER.info("--- LOGGER: <-- method -->");
		ServletActionContext.getRequest().getSession().setAttribute("USER", username);
	}
	
}
