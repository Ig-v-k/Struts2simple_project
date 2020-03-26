package com.struts2.action;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.beans.Card;
import com.struts2.interfaces.ActionsTexts;
import com.struts2.interfaces.CustomServletActionContext;

public class ProfileControllerAction extends ActionSupport implements CustomServletActionContext{
    private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private static final long serialVersionUID = 1L;
	private final Map<String, Card> _cardsMap = new HashMap<String, Card>(0);
	
	public String basicProfile() {
//		my_request.setAttribute("menuInstruments", true);
//		my_request.setAttribute("_cardName", "UserCardName");
//		my_request.setAttribute("_state", 0);
//		LOGGER.info("--- LOGGER: ServletActionContext.getActionContext(my_request).getName() -> " + ServletActionContext.getActionContext(my_request).getName());
//		LOGGER.info("--- LOGGER: ServletActionContext.getActionMapping().getName() -> " + ServletActionContext.getActionMapping().getName());
//		LOGGER.info("--- LOGGER: ServletActionContext.getActionMapping().getNamespace() -> " + ServletActionContext.getActionMapping().getNamespace());
//		LOGGER.info("--- LOGGER: my_request.getContextPath() -> " + my_request.getContextPath());
//		LOGGER.info("--- LOGGER: my_request.getQueryString() -> " + my_request.getQueryString());
//		LOGGER.info("--- LOGGER: my_request.getRequestURI() -> " + my_request.getRequestURI());
//		LOGGER.info("--- LOGGER: my_request.getRequestURL() -> " + my_request.getRequestURL());
//		LOGGER.info("--- LOGGER: my_request.getServletPath() -> " + my_request.getServletPath());
//		LOGGER.info("--- LOGGER: my_request.getServletContext().getContextPath() -> " + my_request.getServletContext().getContextPath());
		my_request.setAttribute("menuInstruments", true);
		
		if ((my_request.getParameter("actionMenu") != null)) {
			LOGGER.info("--- LOGGER: if - statement");
			switch (my_request.getParameter("actionMenu")) {
			case "cards":
				LOGGER.info("--- LOGGER: basicProfile_Card()");
				this.basicProfile_Card();
//					case "transfers":
//						this.basicProfile_Transfers();
//			default:
//				my_request.setAttribute("homeContent", true);
//				break;
			}
		}
		else
			my_request.setAttribute("homeContent", true);
		
		LOGGER.info("--- LOGGER: SUCCESS");
		return ActionsTexts.SUCCESS;
	}
	
	private void basicProfile_Card() {		
		_cardsMap.put("a", new Card("a", "b", "c"));
		
		my_request.setAttribute("cardContent", true);
		my_request.setAttribute("_cardsMap", this._cardsMap);
//		return new CardDecorator(
//				new ImplMethodsCard()).TextAction();
	}
	
//	private String basicProfile_Transfers() {
//		return ActionsTexts.TRANSFERS;
//	}
}