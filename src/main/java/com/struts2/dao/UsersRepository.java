package com.struts2.dao;

import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.todo.UserRole;

public class UsersRepository {
	
	private static final Map<String,Users> map = new HashMap<String,Users>(); 
	
	static {
		initDB();
	}
	
	private static void initDB() {
		Users user1 = new Users("admin", "admin123", UserRole.ADMIN);
		Users user2 = new Users("user", "user", UserRole.USER);
		map.put(user1.getUsername(), user1);
		map.put(user2.getUsername(), user2);
	}
	
	public  Users getUsersById(String id){
		return map.get(id);
	}
	
	public  Map<String,Users> returnAllUsers(){
		return map;
	}
}
