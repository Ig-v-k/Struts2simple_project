package com.struts2.todo;

import com.struts2.beans.Users; 
import com.struts2.interfaces.MethodsTodoUserRegistration;

public class RegistrationPasswordRepeatVerification extends RegistrationClassCenter {

	public RegistrationPasswordRepeatVerification(final MethodsTodoUserRegistration<Users> methodsTodoUser) {
		super(methodsTodoUser);
	}
	
	// -----------------------------------------------------------------
	
	
	@Override
	public boolean descent(String username, String password) {
		return super.descent(username, password);
	}
	
	
	// -----------------------------------------------------------------
}
