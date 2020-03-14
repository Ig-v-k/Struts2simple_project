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
		Users userADMIN1 = new Users("admin", "admin123", UserRole.ADMIN.toString());
		Users userEMPLOYEE1 = new Users("employee", "employee123", UserRole.EMPLOYEE.toString());
		Users userUSERS1 = new Users("user", "user123", UserRole.USER.toString());
		
		mapADMIN.put(userADMIN1.toString(), userADMIN1);
		mapEMPLOYEE.put(userEMPLOYEE1.toString(), userEMPLOYEE1);
		mapUSER.put(userUSERS1.toString(), userUSERS1);
		
		dbUSERS.put(UserRole.ADMIN.toString(), mapADMIN);
		dbUSERS.put(UserRole.EMPLOYEE.toString(), mapEMPLOYEE);
		dbUSERS.put(UserRole.USER.toString(), mapUSER);
	}
	
	@Override
	public Map<String, Users> returnMapUsers(String userRole) {
		return dbUSERS.get(userRole);
	}
}