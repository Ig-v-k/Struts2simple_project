package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.todo.ProfileActionMenu;

public class ProfileControllerAction extends ActionSupport implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ProfileControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	private String typeCard = "";
	private static final ProfileActionMenu PROFILE_ACTION_MENU = new ProfileActionMenu((String)my_session.getAttribute("USER"));
	
/**
   * The controller methods get() & post(), of ContextPath - "struts2_web_iw/profile"
   * @param -
   * @return String - redirect result "SUCCESS/ERROR/NONE"
   */
	public String GET_profile() {
		LOGGER.info("--- LOGGER: (String)my_session.getAttribute(\"USER\") ---> " + (String)my_session.getAttribute("USER"));
		my_request.setAttribute("menuInstruments", true);
		if (my_request.getParameter("actionMenu") != null) {
			PROFILE_ACTION_MENU.basicProfile_Menu(my_request.getParameter("actionMenu"));
			return CustomActionsTexts.SUCCESS;
		}
		else
			my_request.setAttribute("homeContent", true);
		return CustomActionsTexts.SUCCESS;
	}
	public String POST_profile() {
		LOGGER.info("--- LOGGER: typeCard ---> " + this.typeCard);
		
		/* to do realise hierarhy */	
		
		return CustomActionsTexts.SUCCESS;
	}
	
	public void setTypeCard(String typeCard) {
		LOGGER.info("--- LOGGER: setTypeCard ---> " + typeCard);
		this.typeCard = typeCard;
	}
}