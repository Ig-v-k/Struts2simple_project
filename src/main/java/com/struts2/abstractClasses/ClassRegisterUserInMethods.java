package com.struts2.abstractClasses;

import java.util.List;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.dao.ClassDAO;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.todo.ClassRepositoryInitProcessing;
import com.struts2.todo.UserRole;

public abstract class ClassRegisterUserInMethods implements ClassDAO {
	public String registerUserAddIn(String username, String password) {
		assert username.length() != 0;
		assert password.length() != 0;
		
	    Map<String, List<Users>> mapDatabase = ClassRepositoryInitProcessing.getRepository().returnAllUsers();
		if(username.length() == 0 && password.length() == 0)
			throw new NullPointerException("username or password is = null");
		mapDatabase.get(UserRole.USER.toString().toLowerCase()).add(new Users(username, password, UserRole.USER.toString()));
		return ActionsTexts.SUCCESS;
	}
}