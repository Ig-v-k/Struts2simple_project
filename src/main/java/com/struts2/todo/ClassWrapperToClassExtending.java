package com.struts2.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserRoleExtendingMethods;

public class ClassWrapperToClassExtending extends ClassExtendingUsers{

	public ClassWrapperToClassExtending(UserRoleExtendingMethods<ArrayList<String>> userRoleExtendingMethods) {
		super(userRoleExtendingMethods);
	}
	
	@Override
	public ArrayList<String> getAll() {
		return super.getAll();
	}
	
	@Override
	public void rename(String username, String password, String userRole) {
		super.rename(username, password, userRole);
	}
	
	public String registerUser(Users user) {
	    Map<String, List<Users>> mapDatabase = ClassRepositoryInitProcessing.getRepository().returnAllUsers();
		mapDatabase.get(UserRole.USER.toString().toLowerCase()).add(user);
		return ActionsTexts.SUCCESS;
	}
}
