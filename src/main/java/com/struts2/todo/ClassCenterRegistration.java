package com.struts2.todo;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsTodoUserRegistration;

public class ClassCenterRegistration implements MethodsTodoUserRegistration<Users>{
	private MethodsTodoUserRegistration<Users> methodsTodoUserRegistration;
	
	public ClassCenterRegistration(MethodsTodoUserRegistration<Users> userRoleExtendingMethods) {
		this.methodsTodoUserRegistration = userRoleExtendingMethods;
	}
	
	@Override
	public boolean descent(String username, String password) {
		return methodsTodoUserRegistration.descent(username, password);
	}
}