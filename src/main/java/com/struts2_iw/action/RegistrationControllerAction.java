package com.struts2_iw.action;

import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.impl.ImplMethodsRegistration;
import com.struts2_iw.todo.RegistrationUserToSession;
import com.struts2_iw.todo.decorators.RegistrationDecorator;

@Namespace(value="/")
public class RegistrationControllerAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(RegistrationControllerAction.class.getName());
	private String username, password, passwordR, role;
	
	// -----------------------------------------------------------------
	
	
	public String GET_register() {
		return CustomActionsTexts.INPUT;
	}
	
	public String POST_register() {
    	if(ServletActionContext.getRequest().getSession().getAttribute("logined_registeredUSER") != null) {
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
					this.my_Attributes();
					return CustomActionsTexts.SUCCESS;
				}
				else {
					addActionError(getText("error.registration"));
					return CustomActionsTexts.ERROR;
				}
			}
    	}
		return CustomActionsTexts.ERROR;
	} //method
	
	private void my_Attributes() {
		ServletActionContext.getRequest().getSession().setAttribute("labelLogin_Register", true);
		ServletActionContext.getRequest().getSession().setAttribute("logined_registeredUSER", true);
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
	
	public void setRole(String role) {
		this.role = role;
	}
}