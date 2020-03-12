package com.struts2.DB;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserDatabase;
import com.struts2.todo.UserRole;

public class UsersDB implements MethodsToDoUserDatabase{
	
	private static final List<Users> usersADMIN = new ArrayList<Users>();
	private static final List<Users> usersEMPLOYEE = new ArrayList<Users>();
	private static final List<Users> usersUSER = new ArrayList<Users>();
//	private static final Map<String, Users> users = new HashMap<String, Users>();
//	private static final Map<String, Map<String, Users>> map = new HashMap<String, Map<String, Users>>(); 
	private static final Map<String, Users> mapUsers = new HashMap<String, Users>();
	
	static {
		init();
	}
	
	private static void init() {
		Users userADMIN1 = new Users("admin", "admin123", UserRole.ADMIN.toString());
		Users userEMPLOYEE1 = new Users("employee", "employee123", UserRole.EMPLOYEE.toString());
		Users userUSERS1 = new Users("user", "user123", UserRole.USER.toString());
		
		mapUsers.put(userADMIN1.toString(), userADMIN1);
		mapUsers.put(userEMPLOYEE1.toString(), userEMPLOYEE1);
		mapUsers.put(userUSERS1.toString(), userUSERS1);
	}
	
	@Override
	public Map<String, Users> returnAllUsers() {
		return mapUsers;
	}
}