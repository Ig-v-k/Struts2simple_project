package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomLoginTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.todo.ImplMethodsLogin;
import com.struts2_iw.todo.LoginAttributeLoginedUser;
import com.struts2_iw.todo.LoginValidateRole;
import com.struts2_iw.todo.decorators.LoginDecorator;

/**
 * @author iw
 *
 */
public class LoginControllerAction extends ActionSupport implements CustomServletActionContext, CustomActionsTexts, CustomLoginTexts{
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
    private String username = "", password = "", role = "";
    
    
    public String get() {
		return CustomActionsTexts.INPUT;
    }
    
    public String post() {
		switch (new LoginAttributeLoginedUser(
					new LoginValidateRole(
							new LoginDecorator(
									new ImplMethodsLogin())), (String)my_session.getAttribute("logined_registeredUSER")).descent(this.role, username, password)) {
		case SUCCESS_PASSWORD_USER_NAME:
			my_session.setAttribute("USER", this.username);
			my_session.setAttribute("labelLogin_Register", true);
			my_session.setAttribute("logined_registeredUSER", true);
			addActionMessage(getText("success.login"));
			return CustomActionsTexts.SUCCESS;
		case SUCCESS_IS_USER:
			return CustomActionsTexts.SUCCESS;
	    case ERROR_USER_NAME:
	    	addFieldError(getText("field.error.username"), getText("error.username"));
	    	return CustomActionsTexts.ERROR;
		case ERROR_PASSWORD:
			addFieldError(getText("field.error.password"), getText("error.password"));
			return CustomActionsTexts.ERROR;
		case ERROR_EMPTY:
			addFieldError(getText("field.error.login"), getText("error.login"));
			return CustomActionsTexts.ERROR;
		case ERROR_USER_ROLE:
			addFieldError(getText("field.error.role"), getText("error.role"));
			return CustomActionsTexts.ERROR;
		}
		
		return null;
    }
    

	/*
	 * SETTERS
	 */
    public void setRole(String role) {
		this.role = role;
	}
    
    public void setUsername(String username) {
    	this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }    

} // c:LoginControllerAction