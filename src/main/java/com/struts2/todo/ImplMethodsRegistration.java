package com.struts2.todo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.struts2.action.LoginControllerAction;
import com.struts2.beans.User;
import com.struts2.interfaces.MethodsToDoUserRegistration;
import com.struts2.todo.decorators.LoginDecorator;

public class ImplMethodsRegistration implements MethodsToDoUserRegistration{
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private Map<String, User> usersDB = new HashMap<String, User>(0);
	
	@Override
	public boolean putToDB(final String username, final String password, final String userRole) {
		if(!(new LoginDecorator(
				new ImplMethodsLogin(userRole)
				).descent(username, password))) {
			usersDB = ClassInitDB.getRepositoryUsers().returnMapUsers(userRole);
			User user = new User(username, password, userRole);
			usersDB.put(user.toString(), user);
			return true;
		}
		return false;
	}
}