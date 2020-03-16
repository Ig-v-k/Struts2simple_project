package com.struts2.todo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.struts2.action.LoginControllerToDoAction;
import com.struts2.beans.Users;
import com.struts2.interfaces.MethodsToDoUserLogin;

public class ImplMethodsLogin implements MethodsToDoUserLogin{
	private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private String userRole = "";
	private Map<String, Users> map = new HashMap<String, Users>(0);
	private Map<String, Object> session = new HashMap<String, Object>(0);
	
	public ImplMethodsLogin(final String userRole) {
		this.userRole = userRole;
		new ClassInitDB();
	}
	
	public ImplMethodsLogin(final Map<String, Object> session, final String userRole) {
		this.session = session;
		this.userRole = userRole;
		new ClassInitDB();
	}

	
	/*
	 * main
	 */
	@Override
	public boolean descent(final String username, final String password) {
		map = ClassInitDB.getRepositoryUsers().returnMapUsers(this.userRole);
		return map.get(username).equals_PU(username, password) ? 
				(this.session.size() != 0 ? 
						this.toSetInSession(map, username) : false) : false;
	}
	
	private boolean toSetInSession(final Map<String, Users> map, final String username) {
		this.session.put("loginedUSER", map.get(username).getUsername());
		return true;
	}
	
}
