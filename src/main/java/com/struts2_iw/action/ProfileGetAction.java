package com.struts2_iw.action;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.todo.ProfileActionMenu;

public class ProfileGetAction extends ActionSupport {
	private static final Logger LOGGER = Logger.getLogger(ProfileGetAction.class.getName());
	private static final long serialVersionUID = 1L;
	HttpServletRequest my_request = ServletActionContext.getRequest();
	HttpSession my_session = ServletActionContext.getRequest().getSession();
	
    /**
    * The controller methods get() & post(), of ContextPath - "struts2_web_iw/profile"
    * @param -
    * @return String - redirect result "SUCCESS/MAIN_ERROR/NONE"
    */
	public String GET_profile() {
		LOGGER.info("--- LOGGER: method() ");
		my_request.setAttribute("menuInstruments", true);
		if (my_request.getParameter("actionMenu") != null) {
			new ProfileActionMenu((String)my_session.getAttribute("USER")).basicProfile_Menu(my_request.getParameter("actionMenu"));
			return CustomActionsTexts.SUCCESS;
		}
		my_request.setAttribute("homeContent", true);
		return CustomActionsTexts.SUCCESS;
	}
}