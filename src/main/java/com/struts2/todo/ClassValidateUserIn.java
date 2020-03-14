package com.struts2.todo;

import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.UserAware;
import com.struts2.todo.decorators.LoginDecorator;
import com.struts2.todo.decorators.LoginUserSetAttribute;

public class ClassValidateUserIn implements UserAware, ModelDriven<String>,SessionAware {
    private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
    private Map<String, Object> session;
    private String userRole = "";
    private String user;
    
    public ClassValidateUserIn(String userRole) {
    	this.userRole = userRole;
    	new ClassInitDB();
	}
    
    
	/*
	 * main
	 */
    public void setAttribute_DB(final HttpServletRequest request) {
    	new LoginUserSetAttribute(
				new LoginDecorator(
						new ImplMethodsLogin())).setAttributeDB(request, ClassInitDB.
																				getRepositoryUsers().
																				returnMapUsers(this.userRole));
    }
    
    public String initMetods(final String username, final String password, final HttpServletRequest request) {
		return this.descentUser(username, password, this.session, request);
	}
    
	private String descentUser(final String username, final String password, final Map<String, Object> session, final HttpServletRequest request) {
		LOGGER.info("---LOGGER: -------------------- ClassValidate --------------------");
		if(new LoginUserSetAttribute(
				new LoginDecorator(
						new ImplMethodsLogin(this.userRole)), request, ClassInitDB.
																			getRepositoryUsers().
																			returnMapUsers(this.userRole)).descent(username, password))
			return ActionsTexts.NONE;
		return this.sessionPutUserName(username, password, session);
	}
	
	private String sessionPutUserName(final String username, final String password, final Map<String, Object> session) {
		session.put("USERlogin", ClassInitDB.
										getRepositoryUsers().
										returnMapUsers(this.userRole).
										get(username).
										getP_U(username));
		return ActionsTexts.ERROR;
	}
	
	
	
	/*
	 * SETTERS
	 */
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;	
	}
	@Override
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String getModel() {
		return this.user;
	}
}
