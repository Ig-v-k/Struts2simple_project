package com.struts2.action;

import java.util.logging.Logger;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;

public class ProfileControllerAction extends ActionSupport {
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	
	
	public String GET_profile() throws Exception {
		this.my_Attributes();
		return ActionsTexts.SUCCESS;
	}
	
	private void my_Attributes() {
		ServletActionContext.getRequest().setAttribute("menuInstruments", true);
		ServletActionContext.getRequest().setAttribute("state", 100);
	}
}