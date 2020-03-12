package com.struts2.todo;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ModelDriven;
import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserAware;

public class ClassValidateUserIn implements UserAware, ModelDriven<Users> {
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private Users user = null;
    private Map<String, List<Users>> mapDatabase = ClassRepositoryInitProcessing.getRepository().returnAllUsers();
    private String request_parametr;
    
    // -----------------------------------------------------------------
    
    
	public String checkOne(String username, String password, Map<String, Object> session, HttpServletRequest request) {
		LOGGER.info("---LOGGER: -------------------- ClassValidate --------------------");
		if(username == null && !password.equals()) {
			request.setAttribute("db", this.mapDatabase);
			return ActionsTexts.NONE;
		}
		return this.checkTwo(username, password, session);
	}
	
	public String checkTwo(String username, String password, Map<String, Object> session) {
		if(ClassValidateIsToBe.isToBe(mapDatabase, username, password, request_parametr))
			session.put("USER", this.user = new Users(username, password, request_parametr));
		return ActionsTexts.ERROR;
	}
	
	
	// -----------------------------------------------------------------
	
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
}
