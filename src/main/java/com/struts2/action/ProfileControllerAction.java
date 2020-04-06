package com.struts2.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.todo.ImplMethodsCard;
import com.struts2.todo.ImplMethodsContact;
import com.struts2.todo.ImplMethodsCredit;
import com.struts2.todo.ImplMethodsSetting;
import com.struts2.todo.ImplMethodsTransfer;
import com.struts2.todo.decorators.CardDecorator;
import com.struts2.todo.decorators.CardParameter;
import com.struts2.todo.decorators.ContactDecorator;
import com.struts2.todo.decorators.CreditAttributes;
import com.struts2.todo.decorators.CreditDecorator;
import com.struts2.todo.decorators.SettingDecorator;
import com.struts2.todo.decorators.TransferAttributes;
import com.struts2.todo.decorators.TransferDecorator;

public class ProfileControllerAction extends ActionSupport implements CustomServletActionContext{
    @SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	
	public String basic() {
		my_request.setAttribute("menuInstruments", true);
		if (my_request.getParameter("actionMenu") != null) {
			LOGGER.info("--- LOGGER: if() - statment \n" + my_request.getParameter("actionMenu"));
			this.basicProfile_Menu();
			return ActionsTexts.SUCCESS;
		}
		else
			my_request.setAttribute("homeContent", true);
		return ActionsTexts.SUCCESS;
	}
	
	private void basicProfile_Menu() {
		LOGGER.info("--- LOGGER: method");
		switch (my_request.getParameter("actionMenu")) {
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
		LOGGER.info("--- LOGGER: method" + "\n" + my_request.getParameter("actionCard"));
		if(my_request.getParameter("actionCard") != null) {
			if(my_request.getParameter("actionCard").equals("add"))
				my_request.setAttribute("addFormCard", true);
			if(my_request.getParameter("actionCard").equals("edit"))
				my_request.setAttribute("editFormCard", true);
			if(my_request.getParameter("actionCard").equals("delete"))
				new CardParameter(
						new CardDecorator(
								new ImplMethodsCard(my_request.getParameter("cardName") == null ? "" : my_request.getParameter("cardName"), true))).TextAction();
		}
		else
			new CardParameter(
					new CardDecorator(
							new ImplMethodsCard())).TextAction();
	}
	
	private void basicProfile_Transfers() {
		LOGGER.info("--- LOGGER: method" + "\n" + my_request.getParameter("actionTransfer"));
		if(my_request.getParameter("actionTransfer") != null)
			if(my_request.getAttribute("actionTransfer").equals("add"))
				my_request.setAttribute("addTransferForm", true);
		new TransferAttributes(
				new TransferDecorator(
						new ImplMethodsTransfer())).methodToDoTransfer();
	}
	
	private void basicProfile_Credits() {
		LOGGER.info("--- LOGGER: method" + "\n" + my_request.getParameter("actionCredit"));
		if(my_request.getParameter("actionCredit") != null)
			if(my_request.getAttribute("actionCredit").equals("add"))
				my_request.setAttribute("addCreditForm", true);
		new CreditAttributes(
				new CreditDecorator(
						new ImplMethodsCredit())).methodToDoCredit();
	}

	private void basicProfile_Settings() {
		LOGGER.info("--- LOGGER: method");
		if(my_request.getParameter("actionCredit") != null)
			if(my_request.getAttribute("actionTransfer").equals("add"))
				my_request.setAttribute("addTransferForm", true);
		else
			new SettingDecorator(
					new ImplMethodsSetting()).methodToDoSetting();
	}
	
	private void basicProfile_Contacts() {
		LOGGER.info("--- LOGGER: method");
		new ContactDecorator(
				new ImplMethodsContact()).methodToDoContact();
	}
}