package com.struts2.todo;

import java.util.List;
import java.util.Map;

import com.struts2.beans.Users;
import com.struts2.interfaces.ValidateCheckBySearchUser;
import com.struts2.interfaces.ValidateUserRoleMethod;

public class ClassImplementsValidateInterface {
	public String checkRole(ValidateUserRoleMethod validateuserRoleMethod, String request_parametr) {
		return validateuserRoleMethod.checkValidateUserRole(request_parametr);
	}
	
	public boolean UserSearch(ValidateCheckBySearchUser validateCheckBySearchUser, Map<String, List<Users>> map, String username, String password) {
		return validateCheckBySearchUser.checkValidateSearchUser(map, username, password);
	}
}
