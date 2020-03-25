package com.struts2.action;

import java.util.logging.Logger;

//import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;

public class FirstMain extends ActionSupport {
	private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	
	
	/*
	 * main
	 */
    public String boot() {
		LOGGER.info("---LOGGER: method - boot()");

		return ActionsTexts.SUCCESS;
    }
}
