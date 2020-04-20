package com.struts2_iw.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2_iw.DB.CardsDB;
import com.struts2_iw.interfaces.CustomActionsTexts;
import com.struts2_iw.interfaces.CustomServletActionContext;
import com.struts2_iw.todo.ActCardNameInteger;
import com.struts2_iw.todo.ActCardNameIntegerArray;
import com.struts2_iw.todo.ActCardNameIntegerFourBoolean;
import com.struts2_iw.todo.ActCardNameIsSize;
import com.struts2_iw.todo.ProfileValidateData;

public class ProfilePostAction extends ActionSupport implements CustomActionsTexts{
	private static final Logger LOGGER = Logger.getLogger(ProfilePostAction.class.getName());
	private static final long serialVersionUID = 1L;
	private static final ProfileValidateData PROFILE_VALIDATE_DATA = new ProfileValidateData();
//	private String typeCard = "";
	private String card_number = "0000000000000000";
	private String card_pin = "";
//	private String cc_exp_yr = "";
//	private String cc_exp_mo = "";
	private String userFLname = "";
	private boolean button_add_card = false;
	
	private int[] card_number_int_array;
	
	
	public String POST_profile() {
		LOGGER.info("--- LOGGER: method() ");
		
		if(this.validate_data()) {
			new CardsDB().addCardFormDB(
					this.userFLname, 
					this.card_number_int_array, 
					Integer.parseInt(this.card_pin));
			LOGGER.info("--- LOGGER: if() ");
			return REDIRECT_CARDS_CONTENT;
		}
		
		return MAIN_ERROR;
	}
	
	private boolean validate_data() {
		LOGGER.info("--- LOGGER: method() ");
		if(this.button_add_card) {
			if (PROFILE_VALIDATE_DATA.validate_cardNamber(this.card_number).isArrayHasNumbers &&
					PROFILE_VALIDATE_DATA.validate_userFULLname_size(this.userFLname)) {
				this.card_number_int_array =  PROFILE_VALIDATE_DATA.validate_cardNamber(this.card_number).arrayNumbers;
				LOGGER.info("--- LOGGER: if() ");
				return true;
			}
		}
		return false;
	}
	
	// only setters
//	public void setTypeCard(String typeCard) {
//		LOGGER.info("--- LOGGER: typeCard ---> " + typeCard);
//		this.typeCard = typeCard;
//	}

	public void setUserFLname(String userFLname) {
		LOGGER.info("--- LOGGER: userFLname ---> " + userFLname);
		this.userFLname = userFLname;
	}

	public void setCard_number(String card_number) {
		LOGGER.info("--- LOGGER: card_number ---> " + card_number);
		this.card_number = card_number;
	}

	public void setCard_pin(String card_pin) {
		LOGGER.info("--- LOGGER: card_password ---> " + card_pin);
		this.card_pin = card_pin;
	}

	public void setButton_add_card(boolean button_add_card) {
		LOGGER.info("--- LOGGER: button_add_card ---> " + button_add_card);
		this.button_add_card = button_add_card;
	}
	
//	public void setCc_exp_yr(String cc_exp_yr) {
//		LOGGER.info("--- LOGGER: cc_exp_yr ---> " + cc_exp_yr);
//		this.cc_exp_yr = cc_exp_yr;
//	}
//
//	public void setCc_exp_mo(String cc_exp_mo) {
//		LOGGER.info("--- LOGGER: cc_exp_mo ---> " + cc_exp_mo);
//		this.cc_exp_mo = cc_exp_mo;
//	}
	
}
