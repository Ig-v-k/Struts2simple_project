package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.DB.UsersDB;
import com.struts2.action.LoginControllerAction;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserRegistration;

public class ImplMethodsRegistration implements MethodsToDoUserRegistration, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ImplMethodsRegistration.class.getName());
	private UsersDB dbUsers = new UsersDB();
	
	@Override
	public boolean putToDB(final String userName, final String password, final String userRole) {
		if(dbUsers.addUserToDB(userRole, userName, password)) {
			my_session.setAttribute("USER", dbUsers.getUser(userRole, userName).getUserName());
			return true;
		}
		return false;
	}
}