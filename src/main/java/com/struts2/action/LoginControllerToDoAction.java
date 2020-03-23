package com.struts2.action;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.ClassValidateUserIn;

/**
 * @author iw
 *
 */
public class LoginControllerToDoAction extends ActionSupport {
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
    private String username = "", password = "", role = "";
    
    /*
	 * main
	 */
    public String get() {
		return ActionsTexts.INPUT;
    }
    
    public String post() {
    	if(ServletActionContext.getRequest().getSession().getAttribute("logined_registeredUSER") == null) {
	    	switch (new ClassValidateUserIn(this.get_Request().getSession(), this.role).
	    				initMetods(this.username, this.password, this.get_Request())) {
			case SUCCESS:
				LOGGER.info("--- LOGGER: SUCCESS");
				addActionMessage(getText("success.login"));
				this.get_Request().getSession().setAttribute("labelLogin_Register", true);
				this.get_Request().getSession().setAttribute("logined_registeredUSER", true);
				return ActionsTexts.SUCCESS;
	    	}
    	}
    	else 
    		return ActionsTexts.SUCCESS;
		LOGGER.info("--- LOGGER: ERROR");
		addActionError(getText("error.login"));
		return ActionsTexts.ERROR;
    }
    
    private HttpServletRequest get_Request() {
    	return ServletActionContext.getRequest();
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

} // c:LoginControllerToDoAction