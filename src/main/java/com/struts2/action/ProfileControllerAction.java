package com.struts2.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.CustomServletActionContext;

public class ProfileControllerAction extends ActionSupport implements CustomServletActionContext{
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	
	
	public String GET_profile() throws Exception {
		my_request.setAttribute("menuInstruments", true);
		my_request.setAttribute("_cardName", "UserCardName");
		my_request.setAttribute("_state", 0);
		return ActionsTexts.SUCCESS;
	}
}