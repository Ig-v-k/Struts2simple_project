package com.struts2.todo;

import java.util.logging.Logger;

import com.struts2.DB.CardsDB;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCard;

public class ImplMethodsCard implements MethodsToDoUserCard, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ImplMethodsCard.class.getName());
	private CardsDB dbCards = new CardsDB();
	
	@Override
	public void methodToDoCard(final String userName) {
		LOGGER.info("--- LOGGER: method");
		try {
			if(my_request.getParameter("actionCard") != null) {
				switch (my_request.getParameter("actionCard")) {
				case "add":
					dbCards.addCardFormDB();
				case "delete":
					dbCards.deleteCardFromDB(userName, my_request.getParameter("cardName"));
					break;
				default:
					break;
				}
			}
		} 
		finally {
			my_request.setAttribute("cardContent", true);
		}
	}
}
