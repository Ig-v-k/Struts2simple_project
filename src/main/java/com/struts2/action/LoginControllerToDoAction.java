package com.struts2.action;

import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.ClassValidateUserIn;

/**
 * @author iw
 *
 */
@Namespace(value="/")
public class LoginControllerToDoAction extends ActionSupport{
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
    private String username, password, role;
    
    public String GET_login() {
		LOGGER.info("---LOGGER: method - GET_login()");
		return ActionsTexts.INPUT;
    }
    
    public String POST_login() {
    	LOGGER.info("---LOGGER: method - POST_login()");
    	switch (new ClassValidateUserIn().checkOne(this.username, this.password, this.role, ServletActionContext.getRequest())) {
		case NONE:
			LOGGER.info("---LOGGER: NONE");
			return ActionsTexts.NONE;
		case SUCCESS:
			LOGGER.info("---LOGGER: SUCCESS");
			addActionMessage(getText("success.login"));
			return ActionsTexts.SUCCESS;
    	default:
    		LOGGER.info("---LOGGER: ERROR");
    		addActionError(getText("error.login"));
    		return ActionsTexts.ERROR;
    	}
    }
    
    
	/**** 
	 * GETTERS & SETTERS 
	 ****/
    public void setRole(String role) {
		this.role = role;
	}
    
    public void setUsername(String username) {
    	this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
} // c:LoginControllerToDoAction