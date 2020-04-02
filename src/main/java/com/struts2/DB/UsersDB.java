package com.struts2.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.User;
import com.struts2.interfaces.MethodsToDoUserDatabase;
import com.struts2.todo.UserRole;

public class UsersDB implements MethodsToDoUserDatabase{
	private static final Map<String, User> mapADMIN = new HashMap<String, User>();
	private static final Map<String, User> mapEMPLOYEE = new HashMap<String, User>();
	private static final Map<String, User> mapUSER = new HashMap<String, User>();
	
	private static final Map<String, Map<String, User>> dbUSERS = new HashMap<String, Map<String,User>>();
	
	static {
		init();
	}
	
	private static void init() {
		User userADMIN = new User("adminqwe", "admin123", UserRole.ADMIN.toString());
		User userEMPLOYEE = new User("employeeqwe", "employee123", UserRole.EMPLOYEE.toString());
		User userUSERS = new User("userqwe", "user123", UserRole.USER.toString());
		
		mapADMIN.put(userADMIN.getUsername(), userADMIN);
		mapEMPLOYEE.put(userEMPLOYEE.getUsername(), userEMPLOYEE);
		mapUSER.put(userUSERS.getUsername(), userUSERS);
		
		dbUSERS.put(UserRole.ADMIN.toString().toLowerCase(), mapADMIN);
		dbUSERS.put(UserRole.EMPLOYEE.toString().toLowerCase(), mapEMPLOYEE);
		dbUSERS.put(UserRole.USER.toString().toLowerCase(), mapUSER);
	}
	
	@Override
	public Map<String, User> returnMapUsers(final String userRole) {
		return dbUSERS.get(userRole);
	}
}