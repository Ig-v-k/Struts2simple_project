package com.struts2.todo;

import java.util.List;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;

public class ClassRegisterUserIn extends Users{
	private Users user;
	
	public ClassRegisterUserIn(Users user) {
		this.user = user;
	}
	
	@Override
	public String conformity() {
		return registerUser(this.user);
	}

	public String registerUser(Users user) {
	    Map<String, List<Users>> mapDatabase = ClassRepositoryInitProcessing.getRepository().returnAllUsers();
		mapDatabase.get(UserRole.USER.toString().toLowerCase()).add(user);
		return ActionsTexts.SUCCESS;
	}
}