package com.struts2.todo;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ModelDriven;
import com.struts2.DB.UsersDB;
import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserAware;
import com.struts2.interfaces.ValidateUserRoleMethod;

public class ClassValidateUserIn implements UserAware, ModelDriven<Users> {
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private Users user = null;
    private Map<String, List<Users>> mapDatabase = ClassRepositoryInitProcessing.getRepository().returnAllUsers();
    private String request_parametr;
    
	public String checkOne(String username, String password, Map<String, Object> session, HttpServletRequest request) {
		LOGGER.info("---LOGGER: -------------------- ClassValidate --------------------");
		if(username == null && password == null) {
			request_parametr = request.getParameter("paramName").equalsIgnoreCase(UserRole.USER.toString()) ? request.getParameter("paramName") : "";
			request.setAttribute("db", this.mapDatabase);
			return ActionsTexts.NONE;
		}
		return this.checkTwo(username, password, session);
	}
	
//	public String checkTwo(String username, String password, Map<String, Object> session) {
//		if(username.equals(repository.returnAllUsers().get(
//				checkRole((request_parametr) -> {
//					if(request_parametr.equalsIgnoreCase("admin"))
//						return "ADMIN";
//					if(request_parametr.equalsIgnoreCase("employee"))
//						return "EMPLOYEE";
//					else
//						return "USER";
//				})).forEach(action);
//				&& password.equals(repository.returnAllUsers().get(username). ... ())) {
//			session.put("USER", this.user = new Users(username, password, UserRole.USER));
//			return ActionsTexts.SUCCESS;
//		}
//		return ActionsTexts.ERROR;
//	}
	
	public String checktwo(String username, String password, Map<String, Object> session) {
		if(ClassValidateIsToBe.isToBe(mapDatabase, username, password, request_parametr)) {
			session.put("USER", this.user = new Users(username, password, request_parametr));
		}
		return null;
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
	
	public UsersDB getRepository() {
		return repository;
	}
}
