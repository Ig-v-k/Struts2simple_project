package com.struts2.action;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.ClassValidateUserIn;

/**
 * @author iw
 *
 */
public class LoginControllerToDoAction extends ActionSupport implements SessionAware{
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
    private String username = "", password = "", role = "";
    private Map<String, Object> session;
    
    /*
	 * main
	 */
    public String get() {
		return ActionsTexts.INPUT;
    }
    
    public String post() {
    	LOGGER.info("--- LOGGER: session -> " + session);
    	switch (new ClassValidateUserIn(this.session, this.role).
    				initMetods(this.username, this.password, this.get_Request())) {
		case SUCCESS:
			LOGGER.info("--- LOGGER: SUCCESS");
			addActionMessage(getText("success.login"));
			return ActionsTexts.SUCCESS;
    	default:
    		LOGGER.info("--- LOGGER: ERROR");
    		addActionError(getText("error.login"));
    		return ActionsTexts.ERROR;
    	}
    }
    
    private HttpServletRequest get_Request() {
    	return ServletActionContext.getRequest();
    }
    

	/*
	 * SETTERS
	 */
    @Override
    public void setSession(Map session) {
    	this.session = session;
    }
    
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