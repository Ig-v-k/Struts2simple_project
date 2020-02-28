package com.struts2.todo;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.struts2.beans.Users;
import com.struts2.dao.UsersRepository;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserAware;

public class ClassValidateUserIn implements UserAware, SessionAware, ModelDriven<Users>{
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private UsersRepository repository = new UsersRepository();
    private Map<String, Object> session = null;
    private HttpServletRequest request = null;
    private Users user = null;
    
	public String checkOne(String username, String password) {
		LOGGER.info("---LOGGER: method - checkIn");
		return username == null && password == null ? ActionsTexts.INPUT : this.checkTwo(username, password);
	}
	
	private String checkTwo(String username, String password) {
		if(username.equals(repository.returnAllUsers().get(username).getUsername()) && password.equals(repository.returnAllUsers().get(username).getPassword())) {
			session.put("USER", this.user = new Users(username, password, UserRole.USER));
            request.setAttribute("db", this.repository.returnAllUsers());
			return ActionsTexts.SUCCESS;
		}
		return ActionsTexts.ERROR;
	}
	
	
	/**** 
	 * GETTERS & SETTERS 
	****/
	@Override
	public void setUser(Users user) {
		this.user=user;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	@Override
	public Users getModel() {
		return user;
	}
}
