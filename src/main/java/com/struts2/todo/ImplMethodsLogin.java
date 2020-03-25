package com.struts2.todo;

import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import com.struts2.action.LoginControllerAction;
import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserLogin;

public class ImplMethodsLogin implements MethodsToDoUserLogin{
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private String userRole = "";
	private Users user = new Users();
	private HttpSession session;
	
	public ImplMethodsLogin(final String userRole) {
		this.userRole = userRole;
		new ClassInitDB();
	}
	
	public ImplMethodsLogin(final HttpSession session, final String userRole) {
		this.session = session;
		this.userRole = userRole;
		new ClassInitDB();
	}

	
	/*
	 * main
	 */
	@Override
	public boolean descent(final String username, final String password) {
		this.user = ClassInitDB.getRepositoryUsers().returnMapUsers(this.userRole).get(username);
		return this.user == null ? 
				false : user.equals_PU(username, password) ? 
						this.toSetInSession(user, username) : false;
	}
	
	private boolean toSetInSession(final Users user, final String username) {
		this.session.setAttribute("USER", username);
		return true;
	}
	
}
