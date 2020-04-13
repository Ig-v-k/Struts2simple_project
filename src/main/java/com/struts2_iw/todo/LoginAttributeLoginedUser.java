package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.MethodsToDoUserLogin;
import com.struts2_iw.todo.decorators.LoginDecorator;

public class LoginAttributeLoginedUser extends LoginDecorator implements CustomActionsTexts{
    private static final Logger LOGGER = Logger.getLogger(LoginAttributeLoginedUser.class.getName());
    private boolean loginedUser = false;
    
    public LoginAttributeLoginedUser(MethodsToDoUserLogin methodsToDoUserLogin, final boolean loginedUser) {
    	super(methodsToDoUserLogin);
    	LOGGER.info("--- LOGGER: - constructor() ");
    	LOGGER.info("--- LOGGER: - loginedUser ---> " + loginedUser);
    	this.loginedUser = loginedUser;
    }
    
	@Override
	public String descent(String userRole, String username, String password) {
		LOGGER.info("--- LOGGER: - method() ");
		return this.loginedUser ? super.descent(userRole, username, password) : SUCCESS_IS_USER;
	}
}
