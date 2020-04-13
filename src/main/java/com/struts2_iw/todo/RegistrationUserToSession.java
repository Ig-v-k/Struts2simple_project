package com.struts2_iw.todo;

import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;

import com.struts2_iw.action.LoginPostAction;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserRegistration;
import com.struts2_iw.todo.decorators.RegistrationDecorator;

public class RegistrationUserToSession extends RegistrationDecorator{		
	private static final Logger LOGGER = Logger.getLogger(RegistrationUserToSession.class.getName());
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
			super.putToDB(username, password, userRole);
			return true;
		}
		return false;
	}
}
