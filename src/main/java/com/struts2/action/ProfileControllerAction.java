package com.struts2.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.todo.CardAttributeForm;
import com.struts2.todo.CreditAttributes;
import com.struts2.todo.CreditParameters;
import com.struts2.todo.ImplMethodsCard;
import com.struts2.todo.ImplMethodsContact;
import com.struts2.todo.ImplMethodsCredit;
import com.struts2.todo.ImplMethodsSetting;
import com.struts2.todo.ImplMethodsTransfer;
import com.struts2.todo.ProfileActionMenu;
import com.struts2.todo.SettingParameters;
import com.struts2.todo.TransferFormContent;
import com.struts2.todo.decorators.CardDecorator;
import com.struts2.todo.decorators.ContactDecorator;
import com.struts2.todo.decorators.CreditDecorator;
import com.struts2.todo.decorators.SettingDecorator;
import com.struts2.todo.decorators.TransferDecorator;

public class ProfileControllerAction extends ActionSupport implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ProfileControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	private String typeCard = "";
	
/**
   * The controller methods get() & post(), of ContextPath - "struts2_web_iw/profile"
   * @param -
   * @return String - redirect result "SUCCESS/ERROR/NONE"
   */
	public String GET_profile() {
		LOGGER.info("--- LOGGER: (String)my_session.getAttribute(\"USER\") ---> " + (String)my_session.getAttribute("USER"));
		my_request.setAttribute("menuInstruments", true);
		if (my_request.getParameter("actionMenu") != null) {
			new ProfileActionMenu((String)my_session.getAttribute("USER")).basicProfile_Menu(my_request.getParameter("actionMenu"));
			return ActionsTexts.SUCCESS;
		}
		else
			my_request.setAttribute("homeContent", true);
		return ActionsTexts.SUCCESS;
	}
	public String POST_profile() {
		LOGGER.info("--- LOGGER: typeCard ---> " + this.typeCard);
		return ActionsTexts.SUCCESS;
	}
	
	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}
}