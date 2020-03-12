package com.struts2.todo;

import java.util.Map;

import com.struts2.DB.UsersDB;
import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsTodoUserRegistration;

public class RegistrationCompareUsernamePassword implements MethodsTodoUserRegistration<Users>{
	private String userRole = "";
	private Map<String, Users> usersDB = new UsersDB().returnAllUsers();
	
	public RegistrationCompareUsernamePassword(String userRole) {
		this.userRole = userRole;
	}
	
	@Override
	public boolean descent(String username, String password) {
		return username.equals(usersDB.get(this.userRole).getP_U(username)) 
				&& password.equals(usersDB.get(this.userRole).getP_U(password)) ? true : false;
	}
}
