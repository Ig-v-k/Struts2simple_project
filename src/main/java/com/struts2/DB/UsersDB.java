package com.struts2.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserDatabase;
import com.struts2.todo.UserRole;

public class UsersDB implements MethodsToDoUserDatabase{
	private static final Map<String, Users> mapADMIN = new HashMap<String, Users>();
	private static final Map<String, Users> mapEMPLOYEE = new HashMap<String, Users>();
	private static final Map<String, Users> mapUSER = new HashMap<String, Users>();
	
	private static final Map<String, Map<String, Users>> dbUSERS = new HashMap<String, Map<String,Users>>();
	
	static {
		init();
	}
	
	private static void init() {
		Users userADMIN = new Users("adminqwe", "admin123", UserRole.ADMIN.toString());
		Users userEMPLOYEE = new Users("employeeqwe", "employee123", UserRole.EMPLOYEE.toString());
		Users userUSERS = new Users("userqwe", "user123", UserRole.USER.toString());
		
		mapADMIN.put(userADMIN.getUsername(), userADMIN);
		mapEMPLOYEE.put(userEMPLOYEE.getUsername(), userEMPLOYEE);
		mapUSER.put(userUSERS.getUsername(), userUSERS);
		
		dbUSERS.put(UserRole.ADMIN.toString().toLowerCase(), mapADMIN);
		dbUSERS.put(UserRole.EMPLOYEE.toString().toLowerCase(), mapEMPLOYEE);
		dbUSERS.put(UserRole.USER.toString().toLowerCase(), mapUSER);
	}
	
	@Override
	public Map<String, Users> returnMapUsers(final String userRole) {
		return dbUSERS.get(userRole);
	}
}