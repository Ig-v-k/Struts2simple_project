package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.todo.ProfileActionMenu;

public class ProfileControllerAction extends ActionSupport implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ProfileControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	private ProfileActionMenu profileActions = new ProfileActionMenu((String)my_session.getAttribute("USER"));
	private String typeCard = "";
	private String card_number = "0000000000000000";
	private String card_password = "";
	
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
			if (this.profileActions.convertCardName(this.card_number)) {
				this.profileActions.basicProfile_Menu(my_request.getParameter("actionMenu"));
				return CustomActionsTexts.SUCCESS;
			}
		}
		my_request.setAttribute("homeContent", true);
		return CustomActionsTexts.SUCCESS;
	}
	
	
	public void setTypeCard(String typeCard) {
		LOGGER.info("--- LOGGER: typeCard ---> " + typeCard);
		this.typeCard = typeCard;
	}

	public void setCard_number(String card_number) {
		LOGGER.info("--- LOGGER: card_number ---> " + card_number);
		this.card_number = card_number;
	}

	public void setCard_password(String card_password) {
		LOGGER.info("--- LOGGER: card_password ---> " + card_password);
		this.card_password = card_password;
	}
}