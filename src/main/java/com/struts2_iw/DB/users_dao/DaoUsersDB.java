package com.struts2_iw.DB.users_dao;

import com.struts2_iw.beans.User;

public interface DaoUsersDB {
	String verifiUnmPwd(String userRole, String userName, String password);
	User getUser(String userRole, String userName);
	boolean addUserToDB(String userRole, String userName, String password);
}
