package com.struts2.todo;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.struts2.dao.UsersRepository;
import com.struts2.interfaces.ActionsTexts;

public class ClassValidateUserIn {

    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    
    private HttpServletRequest request = ServletActionContext.getRequest();
    private UsersRepository repository = new UsersRepository();
    
	public String checkIn(String username, String password) {
		LOGGER.info("---LOGGER: method - checkIn");
		return username == null && password == null ? ActionsTexts.INPUT : checkIn(username, password, this.request);
	}
	
	public String checkIn(String username, String password, HttpServletRequest request) {
		if(username.equals(repository.returnAllUsers().get(username).getUsername()) && password.equals(repository.returnAllUsers().get(username).getPassword())) {
			request.getSession().setAttribute("user", repository.returnAllUsers().get(username).getUsername());
			return ActionsTexts.SUCCESS;
		}
		return ActionsTexts.ERROR;
	}
}
