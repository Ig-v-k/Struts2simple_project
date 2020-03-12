package com.struts2.todo;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsTodoUser;

public class ClassExtendMethodsToDoUser implements MethodsTodoUser<Users>{
	private MethodsTodoUser<Users> methodsTodoUser;
	
	public ClassExtendMethodsToDoUser() {
		
	}
	
	public ClassExtendMethodsToDoUser(MethodsTodoUser<Users> userRoleExtendingMethods) {
		this.methodsTodoUser = userRoleExtendingMethods;
	}
	
	@Override
	public boolean descent(String username, String password) {
		return methodsTodoUser.descent(username, password);
	}
}