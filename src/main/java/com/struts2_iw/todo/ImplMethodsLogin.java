package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.DB.UsersDB;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomLoginTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.interfaces.MethodsToDoUserLogin;

public class ImplMethodsLogin implements MethodsToDoUserLogin, CustomActionsTexts, CustomLoginTexts, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ImplMethodsLogin.class.getName());
	private final UsersDB db = new UsersDB();
	
	@Override
	public String descent(final String userName, final String password) {
		LOGGER.info("--- LOGGER: method() ");
		return db.verifiUnmPwd(userName, password);
	}
}