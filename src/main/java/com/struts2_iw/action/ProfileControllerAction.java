package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.todo.ProfileActionMenu;

public class ProfileControllerAction extends ActionSupport implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ProfileControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	private final ProfileActionMenu profileActions = new ProfileActionMenu((String)my_session.getAttribute("USER"));
	private String typeCard = "";
	
/**
   * The controller methods get() & post(), of ContextPath - "struts2_web_iw/profile"
   * @param -
   * @return String - redirect result "SUCCESS/ERROR/NONE"
   */
	public String GET_profile() {
		LOGGER.info("--- LOGGER: method() ");
		LOGGER.info("--- LOGGER: typeCard ---> " + this.typeCard);
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
	
	public String POST_profile() {
		if (my_request.getParameter("actionMenu") != null) {
			this.profileActions.basicProfile_Menu(my_request.getParameter("actionMenu"));
			return CustomActionsTexts.SUCCESS;
		}
		my_request.setAttribute("homeContent", true);
		return CustomActionsTexts.SUCCESS;
	}
	
	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}
}