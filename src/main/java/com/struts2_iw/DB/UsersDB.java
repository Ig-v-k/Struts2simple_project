package com.struts2_iw.DB;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import com.struts2_iw.DB.users_dao.DaoUsersDB;
import com.struts2_iw.beans.User;
import com.struts2_iw.interfaces.CustomLoginTexts;
import com.struts2_iw.todo.UserRole;

public final class UsersDB implements DaoUsersDB, CustomLoginTexts{
	private static final Logger LOGGER = Logger.getLogger(UsersDB.class.getName());
	private static final Map<String, User> mapADMIN = new HashMap<String, User>();
	private static final Map<String, User> mapEMPLOYEE = new HashMap<String, User>();
	private static final Map<String, User> mapUSER = new HashMap<String, User>();
	
	private static final Map<String, Map<String, User>> dbUSERS = new HashMap<String, Map<String,User>>();
	
	static {
		init();
	}
	
	private static void init() {
		User userADMIN = new User("admin", "admin123", UserRole.ADMIN.toString());
		User userEMPLOYEE = new User("employee", "employee123", UserRole.EMPLOYEE.toString());
		User userUSERS = new User("user", "user123", UserRole.USER.toString());
		
		mapADMIN.put(userADMIN.getUserName(), userADMIN);
		mapEMPLOYEE.put(userEMPLOYEE.getUserName(), userEMPLOYEE);
		mapUSER.put(userUSERS.getUserName(), userUSERS);
		
		dbUSERS.put(UserRole.ADMIN.toString().toLowerCase(), mapADMIN);
		dbUSERS.put(UserRole.EMPLOYEE.toString().toLowerCase(), mapEMPLOYEE);
		dbUSERS.put(UserRole.USER.toString().toLowerCase(), mapUSER);
	}
	
	@Override
	public String verifiUnmPwd(final String userRole, final String userName, final String password) {
		LOGGER.info("--- LOGGER: - method() -");
		Optional<User> optionalUser = Optional.of(dbUSERS.get(userRole).get(userName));
		if (optionalUser.isPresent()) {
			User user = optionalUser.get();
			if (userName.equals(user.getUserName())) {
				if (user.equals_PU(userName, password)) {
					return SUCCESS_PASSWORD_USER_NAME;
				}
				else
					return ERROR_PASSWORD;
			} 
			else
				return ERROR_USER_NAME;
		}
		else 
			return ERROR_EMPTY;
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