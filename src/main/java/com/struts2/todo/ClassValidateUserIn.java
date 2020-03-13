package com.struts2.todo;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserAware;

public class ClassValidateUserIn implements UserAware, ModelDriven<Users>,SessionAware {
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private Map<String, Users> mapDatabase;
    private Map<String, Object> session;
    private String request_parametr;
    private String userRole = "";
    private Users user;
    
    // -----------------------------------------------------------------
    
    public String checkOne(String username, String password, String userRole, HttpServletRequest request) {
    	this.userRole = userRole;
    	mapDatabase = ClassRepositoryInitProcessing.getRepository().returnAllUsers(userRole);
		return this.checkOne(username, password, this.session, request);
	}
    
	public String checkOne(String username, String password, Map<String, Object> session, HttpServletRequest request) {
		LOGGER.info("---LOGGER: -------------------- ClassValidate --------------------");
		if(!(username.equals(mapDatabase.get(userRole).getP_U(username)))&& 
				!(password.equals(mapDatabase.get(userRole).getP_U(password)))) {
			request.setAttribute("db", this.mapDatabase);
			return ActionsTexts.NONE;
		}
		return this.checkTwo(username, password, session);
	}
	
	public String checkTwo(String username, String password, Map<String, Object> session) {
		session.put("USER", this.user = new Users(username, password, request_parametr));
		return ActionsTexts.ERROR;
	}
	
	
	// -----------------------------------------------------------------
	
	/**** 
	 * GETTERS & SETTERS 
	 ****/
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;	
	}
	
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
}
