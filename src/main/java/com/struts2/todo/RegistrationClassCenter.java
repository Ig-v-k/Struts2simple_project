package com.struts2.todo;

import com.struts2.interfaces.MethodsTodoUserRegistration;

public class RegistrationClassCenter implements MethodsTodoUserRegistration {
	private MethodsTodoUserRegistration methodsTodoUserRegistration;
	public RegistrationClassCenter(MethodsTodoUserRegistration userRoleExtendingMethods) {
		this.methodsTodoUserRegistration = userRoleExtendingMethods;
	}
	
	
	@Override
	public boolean putToDB(String username, String password, String userRole) {
		return this.methodsTodoUserRegistration.putToDB(username, password, userRole);	
	}
	
	
}