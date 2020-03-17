package com.struts2.todo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.decorators.LoginDecorator;
import com.struts2.todo.decorators.LoginUserSetAttribute;

public class ClassValidateUserIn{
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private HttpSession session;
    private String userRole = "";
    
    public ClassValidateUserIn(final HttpSession session, final String userRole) {
    	this.userRole = userRole;
    	this.session = session;
	}
    
    
	/*
	 * main
	 */
    public String initMetods(final String username, final String password, final HttpServletRequest request) {
		return this.descentUser(username, password, request);
	}
    
	private String descentUser(final String username, final String password, final HttpServletRequest request) {
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
