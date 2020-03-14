package com.struts2.todo;

import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserRegistration;
import com.struts2.todo.decorators.LoginDecorator;

public class ImplMethodsRegistration implements MethodsToDoUserRegistration{
	private Map<String, Users> usersDB;
	
	@Override
	public boolean putToDB(String username, String password, String userRole) {
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