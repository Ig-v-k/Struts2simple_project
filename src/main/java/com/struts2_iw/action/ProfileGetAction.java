package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.todo.ProfileActionMenu;

public class ProfileGetAction extends ActionSupport implements CustomServletActionContext {
	private static final Logger LOGGER = Logger.getLogger(ProfileGetAction.class.getName());
	private static final long serialVersionUID = 1L;
	private ProfileActionMenu profileActions = new ProfileActionMenu((String)my_session.getAttribute("USER"));
	
	
    /**
    * The controller methods get() & post(), of ContextPath - "struts2_web_iw/profile"
    * @param -
    * @return String - redirect result "SUCCESS/ERROR/NONE"
    */
	public String GET_profile() {
		LOGGER.info("--- LOGGER: method() ");
		my_request.setAttribute("menuInstruments", true);
		if (my_request.getParameter("actionMenu") != null) {
			this.profileActions.basicProfile_Menu(my_request.getParameter("actionMenu"));
			return CustomActionsTexts.SUCCESS;
		}
//		else {
//			my_request.setAttribute("homeContent", true);
//			return CustomActionsTexts.SUCCESS;
//		}
		my_request.setAttribute("homeContent", true);
		return CustomActionsTexts.SUCCESS;
	}
}