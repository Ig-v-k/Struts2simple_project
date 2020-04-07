package com.struts2.todo.decorators;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.struts2.beans.Card;
import com.struts2.interfaces.CustomServletActionContext;
import com.struts2.interfaces.MethodsToDoUserCard;
import com.struts2.todo.ClassValidateUserIn;

public class CardParameter extends CardDecorator implements CustomServletActionContext{
	private static final Logger LOGGER = Logger.getLogger(ClassValidateUserIn.class.getName());
	private Map<String, Card> _cardsMap = new HashMap<String, Card>(0);
	private String cardName = "";
	private boolean delete = false;
	
	public CardParameter(MethodsToDoUserCard methodsToDoUserCard, final Map<String, Card> _cardsMap) {
		super(methodsToDoUserCard);
		this._cardsMap = _cardsMap;
	}
	
	public CardParameter(MethodsToDoUserCard methodsToDoUserCard, final String cardName, final boolean delete, final Map<String, Card> _cardsMap) {
		super(methodsToDoUserCard);
		this.cardName = cardName;
		this.delete = delete;
		this._cardsMap = _cardsMap;
	}
	
	public CardParameter(MethodsToDoUserCard methodsToDoUserCard) {
		super(methodsToDoUserCard);
	}
	
	@Override
	public void methodToDoCard() {
		this.removeCardOfMap();
		super.methodToDoCard();
	}
	
	private void removeCardOfMap() {
		if(this.delete)
			this._cardsMap.remove(this.cardName);
		my_request.setAttribute("_cardsMap", this._cardsMap);
	}
}
