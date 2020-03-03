package com.struts2.action;

import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.todo.ClassRegisterUserIn;

@Namespace(value="/")
public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username, password;
	
	@Override
	public void validate() {
		if(username.length() == 0 && password.length() == 0)
			addFieldError("username", "The 'username' is required");
	}
	
	public String register() {
		return new ClassRegisterUserIn().registerUserIn(this.username, this.password);
	}
	
	
	/*
	 * GETTERS & SETTERS
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}