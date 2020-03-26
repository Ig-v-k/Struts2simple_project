package com.struts2.action;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.todo.ClassValidateUserIn;

/**
 * @author iw
 *
 */
public class LoginControllerAction extends ActionSupport implements CustomServletActionContext{
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
    private String username = "", password = "", role = "";
    
    /*
	 * main
	 */
    public String get() {
		return ActionsTexts.INPUT;
    }
    
    public String post() {
    	if(my_session.getAttribute("logined_registeredUSER") == null) {
    		if(!this.role.isEmpty()) {
    			LOGGER.info("--- LOGGER: SUCCESS");
    	    	switch (new ClassValidateUserIn(my_session, this.role).
	    				initMetods(this.username, this.password, my_request)) {
				case SUCCESS:
					LOGGER.info("--- LOGGER: SUCCESS");
					addActionMessage(getText("success.login"));
					
					my_session.setAttribute("labelLogin_Register", true);
					my_session.setAttribute("logined_registeredUSER", true);
					return ActionsTexts.SUCCESS;
		    	}
    		}
    	}
    	else
    		return ActionsTexts.SUCCESS;
    	LOGGER.info("--- LOGGER: ERROR");
		addActionError(getText("error.login"));
		return ActionsTexts.ERROR;
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