package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.DB.UsersDB;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserLogin;

public class ImplMethodsLogin implements MethodsToDoUserLogin, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ImplMethodsLogin.class.getName());
	private final UsersDB db = new UsersDB();
	
	@Override
	public boolean descent(final String userRole, final String userName, final String password) {
		if(db.verifiUnmPwd(userRole, userName, password)) {
			LOGGER.info("--- LOGGER: my_session.isNew() ---> " + my_session.isNew());
			if(!my_session.isNew()) {
				my_session.setAttribute("USER", db.getUser(userRole, userName).getUserName());
				my_session.setAttribute("labelLogin_Register", true);
				my_session.setAttribute("logined_registeredUSER", true);
			}
			return true;
		}
		return false;
	}
}