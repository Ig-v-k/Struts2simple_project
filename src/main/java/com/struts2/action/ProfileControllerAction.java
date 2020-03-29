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
	
	public String basicProfile() {
		my_request.setAttribute("menuInstruments", true);
		LOGGER.info("--- LOGGER: my_request.getParameter(\"actionMenu\") -> " + my_request.getParameter("actionMenu"));
		if (my_request.getParameter("actionMenu") != null) {
			switch (my_request.getParameter("actionMenu")) {
			case "cards":
				this.basicProfile_Card();
			}
		}
		else
			my_request.setAttribute("homeContent", true);
		return ActionsTexts.SUCCESS;
	}
	
	private String basicProfile_Card() {
		return new CardParameter(
					new CardDecorator(
							new ImplMethodsCard())).TextAction();
	}
}