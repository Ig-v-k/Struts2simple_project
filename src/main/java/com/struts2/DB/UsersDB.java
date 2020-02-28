package com.struts2.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.todo.UserRole;

public class UsersDB {
	
	private static final Map<String,Users> map = new HashMap<String,Users>(); 
	
	static {
		init();
	}
	
	private static void init() {
		Users user1 = new Users("admin", "admin123", UserRole.ADMIN);
		Users user2 = new Users("user", "user", UserRole.USER);
		Users user3 = new Users("employee", "employee", UserRole.EMPLOYEE);
		map.put(user1.getUsername(), user1);
		map.put(user2.getUsername(), user2);
		map.put(user3.getUsername(), user3);
	}
	
	public Users getUsersById(String id){
		return map.get(id);
	}
	
	public Map<String,Users> returnAllUsers(){
		return map;
	}
}
