package com.struts2.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserRoleExtendingMethods;

public class ClassExtendingUsers extends Users{
	private UserRoleExtendingMethods<ArrayList<String>> userRoleExtendingMethods;
	
	public ClassExtendingUsers(UserRoleExtendingMethods<ArrayList<String>> userRoleExtendingMethods) {
		this.userRoleExtendingMethods = userRoleExtendingMethods;
	}

	@Override
	public ArrayList<String> getAll() {
		return userRoleExtendingMethods.getAll();
	}
	
	@Override
	public void rename(String username, String password, String userRole) {
		userRoleExtendingMethods.rename(username, password, userRole);
	}

}