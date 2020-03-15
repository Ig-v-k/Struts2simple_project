package com.struts2.todo;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.struts2.beans.Users;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserAware;
import com.struts2.todo.decorators.LoginDecorator;
import com.struts2.todo.decorators.LoginUserSetAttribute;

public class ClassValidateUserIn implements SessionAware {
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private Map<String, Object> session;
    private String userRole = "";
    public ClassValidateUserIn(String userRole) {
    	this.userRole = userRole;
    	new ClassInitDB();
	}
    
    
    
	/*
	 * main
	 */
    public String initMetods(final String username, final String password, final HttpServletRequest request) {
		return this.descentUser(username, password, this.session, request);
	}
    
	private String descentUser(final String username, final String password, final Map<String, Object> session, final HttpServletRequest request) {
		LOGGER.info("--- LOGGER: -------------------- ClassValidate --------------------");
		LOGGER.info("--- LOGGER: -------------------- descnet --------------------");
		LOGGER.info("--- LOGGER: -------------------- this.userRole --------------------" + this.userRole);
		Map<String, Users> map = ClassInitDB.getRepositoryUsers().returnMapUsers(this.userRole);
		LOGGER.info("--- LOGGER: -------------------- map --------------------" + map);
		if(new LoginUserSetAttribute(
				new LoginDecorator(
						new ImplMethodsLogin(this.userRole))).descent(username, password)) {
			LOGGER.info("--- LOGGER: -------------------- if --------------------");
			session.put("loginedUSER", map.get(username).getP_U(username));
			return ActionsTexts.SUCCESS;
		}
		return ActionsTexts.ERROR;
	}
	
	
	
	/*
	 * SETTERS
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;	
	}
}
