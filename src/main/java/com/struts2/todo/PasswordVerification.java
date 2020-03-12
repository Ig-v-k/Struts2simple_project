package com.struts2.todo;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsTodoUser;

public class PasswordVerification extends ClassExtendMethodsToDoUser {
//	private MethodsTodoUser<Users> valueMethodsTodoUser = new AddUserToSession();
	
	public PasswordVerification() {
		super(new AddUserToSession());
	}
	public PasswordVerification(MethodsTodoUser<Users> methodsTodoUser) {
		super(methodsTodoUser);
	}
	
	
	public boolean passwordVer(String password, String passwordRepeat) {
		return password == passwordRepeat ? true : false;
	}
	
	
	//
}
