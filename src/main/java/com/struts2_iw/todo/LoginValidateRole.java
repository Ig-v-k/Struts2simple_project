package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.CustomLoginTexts;
import com.struts2_iw.interfaces.MethodsToDoUserLogin;
import com.struts2_iw.todo.decorators.LoginDecorator;

public class LoginValidateRole extends LoginDecorator implements CustomLoginTexts{
    private static final Logger LOGGER = Logger.getLogger(LoginValidateRole.class.getName());
    
    public LoginValidateRole(MethodsToDoUserLogin methodsToDoUserLogin) {
    	super(methodsToDoUserLogin);
    	LOGGER.info("--- LOGGER: - constructor() ");
    }
    
	@Override
	public String descent(String userRole, String username, String password) {
		LOGGER.info("--- LOGGER: - method() ");
		return this.roleEmpty(userRole) ? ERROR_USER_ROLE : super.descent(userRole, username, password);
	}
	
	private boolean roleEmpty(final String userRole) {
		return userRole.isEmpty();
	}
}
