package com.struts2.todo;

import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserRegistration;

public class ImplMethodsRegistration implements MethodsToDoUserRegistration{
	private Map<String, Users> usersDB;
	
	@Override
	public boolean putToDB(String username, String password, String userRole) {
		if(new LoginClassCenter(
				new ImplMethodsLogin(userRole)
				).descent(username, password)) {
			usersDB = ClassRepositoryInitProcessing.getRepository().returnAllUsers(userRole);
			Users user = new Users(username, password, userRole);
			usersDB.put(user.toString(), user);
			return true;
		}
		return false;
	}
}
