package com.struts2.todo;

import java.util.Map;
import java.util.logging.Logger;

import com.struts2.action.LoginControllerToDoAction;
import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserLogin;

public class ImplMethodsLogin implements MethodsToDoUserLogin{
	private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private String userRole = MethodsToDoUserLogin.userRole;
	private Map<String, Users> usersDB;
	
	public ImplMethodsLogin() {}
	
	public ImplMethodsLogin(final String userRole) {
		this.userRole = userRole;
		new ClassInitDB();
		LOGGER.info("--- LOGGER: constructor()");
	}
	
	
	@Override
	public boolean descent(final String username, final String password) {
		LOGGER.info("--- LOGGER: method - descent");
		usersDB = ClassInitDB.getRepositoryUsers().returnMapUsers(this.userRole);
		LOGGER.info("--- LOGGER: userDB " +  usersDB);
		return username.equals(usersDB.get(this.userRole).getP_U(username))
				&& password.equals(usersDB.get(this.userRole).getP_U(password)) ? true : false;
	}
}
