package com.struts2.todo;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsTodoUserRegistration;

public class RegistrationUserToSession extends ClassCenterRegistration implements SessionAware{
	private Map<String, Object> session;
	private String userRole = "";
	private String passwordR = "";
			
	public RegistrationUserToSession(MethodsTodoUserRegistration<Users> userRoleExtendingMethods, final String userRole) {
		super(userRoleExtendingMethods);
		this.userRole = userRole;
	}
	
	// -----------------------------------------------------------------
	
	
	@Override
	public boolean descent(String username, String password) {
		return addUserToSession(new Users(username, password, this.userRole), super.descent(username, password), password);
	}
	
	public boolean addUserToSession(Users user, boolean val, String password) {
		if(val) {
			session.put("USER", user);
			return passwordVer(password, this.passwordR);
		}
		else
			return false;
	}
	
	public boolean passwordVer(String password, String passwordRepeat) {
		return password.equals(passwordRepeat) ? true : false;
	}
	
	
	// -----------------------------------------------------------------
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
