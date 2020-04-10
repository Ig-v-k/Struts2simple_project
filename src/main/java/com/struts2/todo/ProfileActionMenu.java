package com.struts2.todo;

import com.struts2.todo.decorators.CardDecorator;
import com.struts2.todo.decorators.ContactDecorator;
import com.struts2.todo.decorators.CreditDecorator;
import com.struts2.todo.decorators.SettingDecorator;
import com.struts2.todo.decorators.TransferDecorator;

public class ProfileActionMenu {
	private String userName = "";
	
	public ProfileActionMenu(final String userName) {
		this.userName = userName;
	}
	
	public void basicProfile_Menu(final String actionMenuParameter) {
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
	
	private void basicProfile_Cards() {
		new CardAttributeForm(
				new CardDecorator(
						new ImplMethodsCard())).methodToDoCard(this.userName);
	}
	
	private void basicProfile_Transfers() {
		new TransferFormContent(
				new TransferDecorator(
						new ImplMethodsTransfer())).methodToDoTransfer();
	}
	
	private void basicProfile_Credits() {
		new CreditParameters(			
				new CreditAttributes(
						new CreditDecorator(
								new ImplMethodsCredit()))).methodToDoCredit();
	}

	private void basicProfile_Settings() {
		new SettingParameters(
				new SettingDecorator(
						new ImplMethodsSetting())).methodToDoSetting();
	}
	
	private void basicProfile_Contacts() {
		new ContactDecorator(
				new ImplMethodsContact()).methodToDoContact();
	}
}
