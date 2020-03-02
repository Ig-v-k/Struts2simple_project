package com.struts2.todo;

import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.struts2.DB.UsersDB;
import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserAware;

public class ClassValidateUserIn implements UserAware, SessionAware, ModelDriven<Users>{
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private Map<String, Object> session = null;
    private Users user = null;
    private UsersDB repository;
    
    
	public final String checkOne(String username, String password) {
		LOGGER.info("---LOGGER: method - checkIn");
		return username == null && password == null ? ActionsTexts.INPUT : this.checkTwo(username, password);
	}
	
	public final String checkTwo(String username, String password) {
		LOGGER.info("---LOGGER: method - checkTwo()");
		if(username.equals(repository.returnAllUsers().get(username).getUsername()) && password.equals(repository.returnAllUsers().get(username).getPassword())) {
			session.put("USER", this.user = new Users(username, password, UserRole.USER));
			return ActionsTexts.SUCCESS;
		}
		return ActionsTexts.ERROR;
	}
	
	
	/**** 
	 * GETTERS & SETTERS 
	 ****/
	@Override
	public void setUser(Users user) {
		this.user = user;
	}
	
	public Users getUser(Users user){
		return this.user;
	}

	@Override
	public Users getModel() {
		return this.user;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public UsersDB getRepository() {
		return repository;
	}
}
