package com.struts2.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;

public class ProfileControllerAction extends ActionSupport {
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
	private static final long serialVersionUID = 1L;
	
	
	public String GET_profile() throws Exception {
		return ActionsTexts.SUCCESS;
	}
}