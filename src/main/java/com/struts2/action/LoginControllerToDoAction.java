package com.struts2.action;
 
import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.ClassValidateUserIn;

/**
 * @author iw
 *
 */
@Namespace(value="/")
public class LoginControllerToDoAction extends ActionSupport implements SessionAware{
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
    private Map<String, Object> session;
    private String username, password;
    private Date timedate;
    
    public String GET_login() {
		LOGGER.info("---LOGGER: method - GET_login()");
		return ActionsTexts.INPUT;
    }
    
    public String POST_login() {
    	LOGGER.info("---LOGGER: method - POST_login()");
    	switch (new ClassValidateUserIn().checkOne(this.username, this.password, this.session, ServletActionContext.getRequest())) {
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
    public void setSession(Map<String, Object> session) {
		this.session = session;
	}
    
    public String getUsername() {
    	return this.username;
    }

    public void setUsername(String username) {
    	this.username = username;
    }
 
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Date getDate() {
		return timedate;
	}
    
} // c:LoginControllerToDoAction