package com.struts2.DB;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.struts2.DB.users_dao.DaoUsersDB;
import com.struts2.beans.User;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.todo.ImplMethodsLogin;
import com.struts2.todo.UserRole;

public final class UsersDB implements DaoUsersDB{
	private static final Logger LOGGER = Logger.getLogger(UsersDB.class.getName());
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
		
		mapADMIN.put(userADMIN.getUserName(), userADMIN);
		mapEMPLOYEE.put(userEMPLOYEE.getUserName(), userEMPLOYEE);
		mapUSER.put(userUSERS.getUserName(), userUSERS);
		
		dbUSERS.put(UserRole.ADMIN.toString().toLowerCase(), mapADMIN);
		dbUSERS.put(UserRole.EMPLOYEE.toString().toLowerCase(), mapEMPLOYEE);
		dbUSERS.put(UserRole.USER.toString().toLowerCase(), mapUSER);
	}
	
	@Override
	public boolean verifiUnmPwd(final String userRole, final String userName, final String password) {
		if(userRole.equalsIgnoreCase("employee") || userRole.equalsIgnoreCase("user")) {
			User user = dbUSERS.get(userRole).get(userName);
			LOGGER.info("--- LOGGER: method");
			if(user != null && user.equals_PU(userName, password)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public User getUser(final String userRole, final String userName) {
		return dbUSERS.get(userRole).get(userName);
	}
	
	@Override
	public boolean addUserToDB(final String userRole, final String userName, final String password) {
		if(userRole.equalsIgnoreCase("employee") && userRole.equalsIgnoreCase("user")) {
			if(!dbUSERS.get(userRole).containsKey(userName)) {
				dbUSERS.get(userRole).put(userName, new User(userName, password, userRole));
				return true;
			}
		}
		return false;
	}
}