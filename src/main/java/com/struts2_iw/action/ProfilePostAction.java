package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;

public class ProfilePostAction extends ActionSupport implements CustomServletActionContext{
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Logger.getLogger(ProfilePostAction.class.getName());
	private String typeCard = "";
	private String card_number = "0000000000000000";
	private String card_password = "";
	private boolean button_add_card = false;
	
	
	// main
	public String POST_profile() {
		LOGGER.info("--- LOGGER: method() ");
		
		// to do here ... com.struts2_iw.todo | new ProfileActionMenu()
		
		my_request.setAttribute("homeContent", true);
		return CustomActionsTexts.SUCCESS;
	}
	
	// to do here need to create a method for the validation pre-process post method
	
	
	// setters & getters
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

	public void setButton_add_card(boolean button_add_card) {
		LOGGER.info("--- LOGGER: button_add_card ---> " + button_add_card);
		this.button_add_card = button_add_card;
	}
}
