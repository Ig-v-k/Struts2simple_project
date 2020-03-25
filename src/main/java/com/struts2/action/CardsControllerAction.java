package com.struts2.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.CustomServletActionContext;

public class CardsControllerAction extends ActionSupport implements CustomServletActionContext{
	
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());

	public String basic() {
		LOGGER.info("--- LOGGER: SUCCESS");
		my_request.setAttribute("menuInstruments", true);
		return ActionsTexts.SUCCESS;
	}
}
