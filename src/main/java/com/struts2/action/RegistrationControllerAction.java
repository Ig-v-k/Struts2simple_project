package com.struts2.action;

import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.ImplMethodsRegistration;
import com.struts2.todo.decorators.RegistrationDecorator;
import com.struts2.todo.decorators.RegistrationUserToSession;

@Namespace(value="/")
public class RegistrationControllerAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private String username, password, passwordR, role;
	
	// -----------------------------------------------------------------
	
	
	public String GET_register() {
		return ActionsTexts.INPUT;
	}
	
	public String POST_register() {
		LOGGER.info("---LOGGER: method - POST_register");
		LOGGER.info("---LOGGER: \nUsername = " + this.username 
				+ "\n" + "Password = " + this.password 
				+ "\n" + "PasswordRepeat = " + this.passwordR
				+ "\n" + "UserRole = " + this.role);
		
		if ((!this.username.isEmpty()) && (!this.password.isEmpty()) && (!this.passwordR.isEmpty())) {
			if (new RegistrationUserToSession(
					new RegistrationDecorator(
							new ImplMethodsRegistration()
					),
				this.passwordR).putToDB(username, password, this.role)) {
				ServletActionContext.getRequest().getSession().setAttribute("logined_registeredUSER", true);
				return ActionsTexts.SUCCESS;
			}
			else {
				addActionError(getText("error.registration"));
				return ActionsTexts.ERROR;
			} //else
		} //if
		
		return ActionsTexts.ERROR;
	} //POST_register
	
	
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
	
	public void setRole(String role) {
		this.role = role;
	}
}