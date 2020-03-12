package com.struts2.todo;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsTodoUser;

public class AddUserToSession extends ClassExtendMethodsToDoUser implements SessionAware{
	private Map<String, Object> session;
	
	public AddUserToSession() {
		super();
	}
	public AddUserToSession(MethodsTodoUser<Users> userRoleExtendingMethods) {
		super(userRoleExtendingMethods);
	}
	
	
	@Override
	public boolean descent(String username, String password) {
	 	return super.descent(username, password);
	}
	 
	public void registerUser(Users user) {
	 	session.put("USER", user);
	}
	
	
	// -----------------------------
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
