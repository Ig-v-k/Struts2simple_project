package com.struts2.todo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.decorators.LoginDecorator;
import com.struts2.todo.decorators.LoginUserSetAttribute;

public class ClassValidateUserIn{
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private Map<String, Object> session = new HashMap<String, Object>(0);
    private String userRole = "";
    public ClassValidateUserIn(final Map<String, Object> session, final String userRole) {
    	this.userRole = userRole;
    	this.session = session;
	}
    
    
	/*
	 * main
	 */
    public String initMetods(final String username, final String password, final HttpServletRequest request) {
		return this.descentUser(username, password, this.session, request);
	}
    
	private String descentUser(final String username, final String password, final Map<String, Object> session, final HttpServletRequest request) {
		if(new LoginUserSetAttribute(
				new LoginDecorator(
						new ImplMethodsLogin(this.session, this.userRole))).descent(username, password)) {
			return ActionsTexts.SUCCESS;
		}
		return ActionsTexts.ERROR;
	}
	
	
	
	/*
	 * SETTERS
	 */
}
