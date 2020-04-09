package com.struts2.DB.users_dao;

import com.struts2.beans.User;

public interface DaoUsersDB {
	boolean verifiUnmPwd(String userRole, String userName, String password);
	User getUser(String userRole, String userName);
	boolean addUserToDB(String userRole, String userName, String password);
}
