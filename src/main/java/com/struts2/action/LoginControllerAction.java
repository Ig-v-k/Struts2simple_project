package com.struts2.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.todo.LoginValidateAction;

/**
 * @author iw
 *
 */
public class LoginControllerAction extends ActionSupport implements CustomServletActionContext{
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
    private String username = "", password = "", role = "";
    
    
    public String get() {
		return ActionsTexts.INPUT;
    }
    
    public String post() {
    	LOGGER.info("--- LOGGER: my_session.getAttribute(\"logined_registeredUSER\") ---> " + my_session.getAttribute("logined_registeredUSER"));
    	LOGGER.info("--- LOGGER: role ---> " + this.role);
    	if(my_session.getAttribute("logined_registeredUSER") == null) {
    		if(!this.role.isEmpty()) {
    	    	switch (new LoginValidateAction().descentUser(this.role, this.username, this.password)) {
				case ActionsTexts.SUCCESS:
					addActionMessage(getText("success.login"));
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