package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomLoginTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.todo.ImplMethodsLogin;
import com.struts2_iw.todo.LoginAttributeLoginedUser;
import com.struts2_iw.todo.decorators.LoginDecorator;

/**
 * @author iw
 *
 */
public class LoginPostAction extends ActionSupport implements CustomServletActionContext, CustomActionsTexts, CustomLoginTexts{
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginPostAction.class.getName());
	private String username = "", password = "" /* role = "" */;
    
    
    @Override
    public void validate(){
    	LOGGER.info("--- LOGGER: username ---> " + this.username);
    	LOGGER.info("--- LOGGER: password ---> " + this.password);
		if (this.username.isEmpty() && this.password.isEmpty()) {
			my_request.setAttribute(getText("field.error.username"), true);
			my_request.setAttribute(getText("field.error.password"), true);
			addFieldError(getText("field.error.username"), getText("error.empty.username"));
			addFieldError(getText("field.error.password"), getText("error.empty.password"));
		}
    }
    
    public String l_post() {
    	LOGGER.info("--- LOGGER: method() ");
		switch (new LoginAttributeLoginedUser(
						new LoginDecorator(
								new ImplMethodsLogin()),
				my_session.getAttribute("logined_registeredUSER") == null ? true : false).descent(this.username, this.password)) {
		case SUCCESS_PASSWORD_USER_NAME:
			LOGGER.info("--- LOGGER: case -> " + SUCCESS_PASSWORD_USER_NAME);
			my_session.setAttribute("USER", this.username);
			my_session.setAttribute("labelLogin_Register", true);
			my_session.setAttribute("logined_registeredUSER", true);
			addActionMessage(getText("success.login"));
			return CustomActionsTexts.SUCCESS;
		case SUCCESS_IS_PRESENT_USER:
			LOGGER.info("--- LOGGER: case -> " + SUCCESS_IS_PRESENT_USER);
			return CustomActionsTexts.NONE;
//	    case ERROR_USER_NAME:
//	    	LOGGER.info("--- LOGGER: case -> " + ERROR_USER_NAME);
//	    	my_request.setAttribute(getText("field.error.username"), true);
//	    	addFieldError(getText("field.error.username"), getText("error.incorrect.username"));
//	    	return CustomActionsTexts.ERROR;
		case ERROR_PASSWORD_USER_NAME: // here can be a string - error_password
			LOGGER.info("--- LOGGER: case -> " + ERROR_PASSWORD);
			my_request.setAttribute(getText("field.error.login"), true);
			addFieldError(getText("field.error.login"), getText("error.or.login"));
			return CustomActionsTexts.ERROR;
//		case ERROR_USER_ROLE:
//			LOGGER.info("--- LOGGER: case -> " + ERROR_USER_ROLE);
//			addFieldError(getText("field.error.role"), getText("error.role"));
//			return CustomActionsTexts.ERROR;
		case ERROR_USER_NAME:
			LOGGER.info("--- LOGGER: case -> " + ERROR_USER_NAME);
			my_request.setAttribute(getText("field.error.username"), true);
			addFieldError(getText("field.error.username"), getText("error.incorrect.username"));
			return CustomActionsTexts.ERROR;
		default:
			LOGGER.info("--- LOGGER: case default");
			return CustomActionsTexts.ERROR;
		}
    }

	/*
	 * SETTERS
	 */
//    public void setRole(String role) {
//    	LOGGER.info("--- LOGGER: method() ");
//		this.role = role;
//	}
    
    public void setUsername(String username) {
    	LOGGER.info("--- LOGGER: method() ");
    	this.username = username;
    }

    public void setPassword(String password) {
    	LOGGER.info("--- LOGGER: method() ");
        this.password = password;
    }    

} // c:LoginPostAction