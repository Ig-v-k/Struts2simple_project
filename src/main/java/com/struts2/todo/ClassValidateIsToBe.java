package com.struts2.todo;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.struts2.beans.Users;

public class ClassValidateIsToBe {
	public static boolean isToBe(Map<String, List<Users>> map, String username, String password, String request_parametr) {
		Objects.requireNonNull(map);
		assert username.length() != 0;
		assert password.length() != 0;
		
//		if (username.equals(map.get(new ClassImplementsValidateInterface()
//				.checkRole((parametr) -> {
//					if(parametr.equalsIgnoreCase("admin"))
//						return UserRole.ADMIN.toString();
//					if(parametr.equalsIgnoreCase("employee"))
//						return UserRole.EMPLOYEE.toString();
//					return UserRole.USER.toString();
//				}, request_parametr)))) {
//			
//		}
		if(isToBeAssist(map.get(new ClassImplementsValidateInterface()
				.checkRole((parametr) -> {
					if(parametr.equalsIgnoreCase("admin"))
						return UserRole.ADMIN.toString();
					if(parametr.equalsIgnoreCase("employee"))
						return UserRole.EMPLOYEE.toString();
					return UserRole.USER.toString();
				}, request_parametr)), username, password)) {
			return true;
		}
		return false;
	}
	
	private static boolean isToBeAssist(List<Users> list, String username, String password) {
		for(Users u : list)
			if(u.getUsername().equals(username) && u.getPassword().equals(password))
					return true;
		return false;
	}
}
