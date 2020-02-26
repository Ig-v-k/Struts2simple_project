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
		Users admin = new Users("admin", "admin123", UserRole.ADMIN);
		map.put(admin.getUsername(), admin);
	}
	
	public  Users getUsersById(String id){
		return map.get(id);
	}
	
	public  Map<String,Users> returnAllUsers(){
		return map;
	}
}
