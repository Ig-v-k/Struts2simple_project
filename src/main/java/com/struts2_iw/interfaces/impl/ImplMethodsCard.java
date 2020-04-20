package com.struts2_iw.interfaces.impl;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.struts2_iw.DB.CardsDB;
import com.struts2_iw.interfaces.MethodsToDoUserCard;

public class ImplMethodsCard implements MethodsToDoUserCard {
	private static final Logger LOGGER = Logger.getLogger(ImplMethodsCard.class.getName());
	private CardsDB dbCards = new CardsDB();
	HttpServletRequest my_request = ServletActionContext.getRequest();
	
	@Override
	public void methodToDoCard(final String userName) {
		LOGGER.info("--- LOGGER: method");
		try {
			if(my_request.getParameter("actionCard") != null) {
				switch (my_request.getParameter("actionCard")) {
				case "delete":
					dbCards.deleteCardFromDB(userName, my_request.getParameter("cardName"));
					break;
				default:
					break;
				}
			}
		} 
		finally {
			my_request.setAttribute("_cardsMap", dbCards.getCardMap(userName));
			my_request.setAttribute("cardContent", true);
		}
	}
}
