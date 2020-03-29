package com.struts2.action;

import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.todo.ImplMethodsCard;
import com.struts2.todo.decorators.CardDecorator;
import com.struts2.todo.decorators.CardParameter;

public class ProfileControllerAction extends ActionSupport implements CustomServletActionContext{
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	
	public String basic() {
		LOGGER.info("--- LOGGER: my_request.getParameter(\"actionMenu\") -> " + my_request.getParameter("actionMenu"));
		LOGGER.info("--- LOGGER: my_request.getParameter(\"cardName\") -> " + my_request.getParameter("cardName"));
		LOGGER.info("--- LOGGER: my_request.getParameter(\"actionCard\") -> " + my_request.getParameter("actionCard"));
		my_request.setAttribute("menuInstruments", true);
		if (my_request.getParameter("actionMenu") != null) {
			this.basicProfile_Menu();
			return ActionsTexts.SUCCESS;
		}
		else
			my_request.setAttribute("homeContent", true);
		return ActionsTexts.SUCCESS;
	}
	
	private void basicProfile_Menu() {
		switch (my_request.getParameter("actionMenu")) {
		case "cards":
			this.basicProfile_Card();
		}
//		case "transfers":
//			this.basicProfile_Transfers();
//		}
//		case "credits":
//			this.basicProfile_Credits();
//		}
//		case "services":
//			this.basicProfile_Services();
//		}
//		case "contacts":
//			this.basicProfile_Contacts();
//		}
	}
	
	private void basicProfile_Card() {
		
		if(my_request.getParameter("actionCard") != null && my_request.getParameter("cardName") != null) {
			if(my_request.getParameter("actionCard").equals("edit"))
				my_request.setAttribute("editFormCard", true);
			if(my_request.getParameter("actionCard").equals("delete"))
				new CardParameter(
						new CardDecorator(
								new ImplMethodsCard(my_request.getParameter("cardName"), true))).TextAction();
		}
	}
	
//	private void basicProfile_Transfers() {
//		
//	}
//	
//	private void basicProfile_Credits() {
//		
//	}
//
//	private void basicProfile_Services() {
//		
//	}
//	
//	private void basicProfile_Contacts() {
//		
//	}
}