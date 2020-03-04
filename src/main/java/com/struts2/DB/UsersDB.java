package com.struts2.DB;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.todo.UserRole;

public class UsersDB {
	
	private static final List<Users> usersADMIN = new ArrayList<Users>();
	private static final List<Users> usersEMPLOYEE = new ArrayList<Users>();
	private static final List<Users> usersUSER = new ArrayList<Users>();
//	private static final Map<String, Users> users = new HashMap<String, Users>();
	private static final Map<String, List<Users>> map = new HashMap<String, List<Users>>(); 
	
	static {
		init();
	}
	
	private static void init() {
		Users userADMIN1 = new Users("admin", "admin123", UserRole.ADMIN);
		Users userEMPLOYEE1 = new Users("employee", "employee", UserRole.EMPLOYEE);
		
		usersADMIN.add(userADMIN1);
		
		usersEMPLOYEE.add(userEMPLOYEE1);
		
		map.put(UserRole.ADMIN.toString().toLowerCase(), usersADMIN);
		map.put(UserRole.EMPLOYEE.toString().toLowerCase(), usersEMPLOYEE);
		map.put(UserRole.USER.toString().toLowerCase(), usersUSER);
	}
	
	public Map<String, List<Users>> returnAllUsers(){
		return map.forEach(action);;
	}
}