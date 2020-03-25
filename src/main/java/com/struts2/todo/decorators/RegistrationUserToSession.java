package com.struts2.todo.decorators;

import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;

import com.struts2.action.LoginControllerAction;
import com.struts2.interfaces.MethodsToDoUserRegistration;

public class RegistrationUserToSession extends RegistrationDecorator {		
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
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
		if(password.equals(this.passwordRepeat) && super.putToDB(username, password, userRole)) {
			this.putToSession(username);
			return true;
		}
		return false;
	}
	
	private void putToSession(final String username) {
		ServletActionContext.getRequest().getSession().setAttribute("USER", username);
	}
}
