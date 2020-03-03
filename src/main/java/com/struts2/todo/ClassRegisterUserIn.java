package com.struts2.todo;

import com.struts2.DB.UsersDB;
import com.struts2.abstractClasses.ClassRegisterUserInMethods;
import com.struts2.interfaces.ActionsTexts;

public class ClassRegisterUserIn extends ClassRegisterUserInMethods{
	private UsersDB repository = new UsersDB();
	
	@Override
	public String registerUserIn(String username, String password) {
		repository.returnAllUsers().get(UserRole.USER);
		return ActionsTexts.SUCCESS;
	}
}