package com.struts2.todo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.struts2.action.LoginControllerToDoAction;
import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserRegistration;
import com.struts2.todo.decorators.LoginDecorator;

public class ImplMethodsRegistration implements MethodsToDoUserRegistration{
	private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private Map<String, Users> usersDB = new HashMap<String, Users>(0);
	
	@Override
	public boolean putToDB(String username, String password, String userRole) {
		LOGGER.info("--- LOGGER: <-- method -->");
		if(!(new LoginDecorator(
				new ImplMethodsLogin(userRole)
				).descent(username, password))) {
			usersDB = ClassInitDB.getRepositoryUsers().returnMapUsers(userRole);
			Users user = new Users(username, password, userRole);
			usersDB.put(user.toString(), user);
			return true;
		}
		return false;
	}
}
