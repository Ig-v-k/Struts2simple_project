package com.struts2.todo;

import java.util.Map;
import java.util.logging.Logger;

import com.struts2.DB.CardsDB;
import com.struts2.action.LoginControllerAction;
import com.struts2.beans.Card;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCard;

public class ImplMethodsCard implements MethodsToDoUserCard, CustomServletActionContext{
	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private static final Map<String, Card> _cardsMap = CardsDB.returnMapCard();
	private String cardName = "";
	private boolean delete = false;
	
	public ImplMethodsCard() {}
	
	public ImplMethodsCard(final String cardName, final boolean delete) {
		this.cardName = cardName;
		this.delete = delete;
	}
	
	@Override
	public void TextAction() {
		if(this.delete)
			ImplMethodsCard._cardsMap.remove(this.cardName);
		my_request.setAttribute("_cardsMap", ImplMethodsCard._cardsMap);
		my_request.setAttribute("cardContent", true);
	}
}
