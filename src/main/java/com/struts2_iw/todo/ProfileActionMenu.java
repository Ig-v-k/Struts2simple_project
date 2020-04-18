package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.impl.ImplMethodsCard;
import com.struts2_iw.interfaces.impl.ImplMethodsContact;
import com.struts2_iw.interfaces.impl.ImplMethodsCredit;
import com.struts2_iw.interfaces.impl.ImplMethodsSetting;
import com.struts2_iw.interfaces.impl.ImplMethodsTransfer;
import com.struts2_iw.todo.decorators.CardDecorator;
import com.struts2_iw.todo.decorators.ContactDecorator;
import com.struts2_iw.todo.decorators.CreditDecorator;
import com.struts2_iw.todo.decorators.SettingDecorator;
import com.struts2_iw.todo.decorators.TransferDecorator;

public final class ProfileActionMenu {
	private static final Logger LOGGER = Logger.getLogger(ProfileActionMenu.class.getName());
	private String userName = "";
	
	public ProfileActionMenu() {
		LOGGER.info("--- LOGGER: constructor() - empty ");
	}
	
	public ProfileActionMenu(final String userName) {
		LOGGER.info("--- LOGGER: constructor() ");
		this.userName = userName;
	}
	
	public void basicProfile_Menu(final String actionMenuParameter) {
		LOGGER.info("--- LOGGER: method() ");
		switch (actionMenuParameter) {
		case "cards":
			this.basicProfile_Cards();
			break;
		case "transfers":
			this.basicProfile_Transfers();			
			break;
		case "credits":
			this.basicProfile_Credits();
			break;
		case "settings":
			this.basicProfile_Settings();
			break;
		case "contacts":
			this.basicProfile_Contacts();			
			break;
		}
	}
	
	public boolean convertCardName(final String cardName) {
		LOGGER.info("--- LOGGER: method() ");
		return new ActCardNameIsSize(
				new ActCardNameIntegerFourBoolean(
						new ActCardNameIntegerArray(
								new ActCardNameInteger())), cardName).getCardName().isArrayHasNumbers;
	}
	
	private void basicProfile_Cards() {
		LOGGER.info("--- LOGGER: method() ");
		new CardAttributeForm(
				new CardDecorator(
						new ImplMethodsCard())).methodToDoCard(this.userName);
	}
	
	private void basicProfile_Transfers() {
		LOGGER.info("--- LOGGER: method() ");
		new TransferFormContent(
				new TransferDecorator(
						new ImplMethodsTransfer())).methodToDoTransfer();
	}
	
	private void basicProfile_Credits() {
		LOGGER.info("--- LOGGER: method() ");
		new CreditParameters(			
				new CreditAttributes(
						new CreditDecorator(
								new ImplMethodsCredit()))).methodToDoCredit();
	}

	private void basicProfile_Settings() {
		LOGGER.info("--- LOGGER: method() ");
		new SettingParameters(
				new SettingDecorator(
						new ImplMethodsSetting())).methodToDoSetting();
	}
	
	private void basicProfile_Contacts() {
		LOGGER.info("--- LOGGER: method() ");
		new ContactDecorator(
				new ImplMethodsContact()).methodToDoContact();
	}
}
