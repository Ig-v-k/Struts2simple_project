package com.struts2.todo;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.struts2.action.LoginControllerAction;
import com.struts2.beans.Card;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCard;

public class ImplMethodsCard implements MethodsToDoUserCard, CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(LoginControllerAction.class.getName());
	private final Map<String, Card> _cardsMap = new HashMap<String, Card>(0);
	private String cardName = "";
	private boolean delete = false;
	
	public ImplMethodsCard(final String cardname, final boolean delete) {
		this.cardName = cardName;
		this.delete = delete;
	}
	
	@Override
	public void TextAction() {
		if(this.delete)
			this._cardsMap.remove(this.cardName);

		_cardsMap.put("a", new Card("a", "b", "c"));		
		my_request.setAttribute("cardContent", true);
		my_request.setAttribute("_cardsMap", this._cardsMap);
	}
}
