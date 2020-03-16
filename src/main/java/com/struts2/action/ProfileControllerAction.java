package com.struts2.action;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;

public class ProfileControllerAction extends ActionSupport implements SessionAware{
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session = new HashMap<String, Object>(0);

	
	public String GET_profile() throws Exception {
		LOGGER.info("--- LOGGER: session.get('loginedUSER')" + session.get("loginedUSER"));
		return ActionsTexts.SUCCESS;
	}
	
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;	
	}
}
