package com.struts2.abstractClasses;

import com.struts2.DB.UsersDB;
import com.struts2.beans.Users;
import com.struts2.dao.ClassDAO;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.UserRole;

public abstract class ClassRegisterUserInMethods implements ClassDAO {
	public String registerUserAddIn(String username, String password) {
		UsersDB repository = new UsersDB();
		if(username.length() == 0 && password.length() == 0)
			throw new NullPointerException("username or password is = null");
		
		repository.returnAllUsers().get(UserRole.USER.toString().toLowerCase()).add(new Users(username, password, UserRole.USER));
		return ActionsTexts.SUCCESS;
	}
}