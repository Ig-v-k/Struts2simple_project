package com.struts2.action;

import java.util.logging.Logger;

import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.RegistrationUserToSession;
import com.struts2.todo.ClassCenterRegistration;
import com.struts2.todo.RegistrationCompareUsernamePassword;
//import com.struts2.todo.ClassExtendingUsers;
import com.struts2.todo.RegistrationPasswordRepeatVerification;

@Namespace(value="/")
public class RegistrationAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private String username, password, passwordR, userRole;
	
	// -----------------------------------------------------------------
	
	
	public String GET_register() {
		return ActionsTexts.INPUT;
	}
	
	public String POST_register() {
		LOGGER.info("---LOGGER: method - POST_register");
		assert username.length() != 0;
		assert password.length() != 0;
		assert passwordR.length() != 0;
		
		return new RegistrationPasswordRepeatVerification(
						new RegistrationUserToSession(
								new ClassCenterRegistration(
										new RegistrationCompareUsernamePassword(this.userRole)
										), this.userRole
								)
						).descent(this.username, password) == true ? ActionsTexts.SUCCESS : ActionsTexts.ERROR;
	}
	
	
	// -----------------------------------------------------------------
	
	/*
	 * GETTERS & SETTERS
	 */
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setPasswordR(String passwordR) {
		this.passwordR = passwordR;
	}
}