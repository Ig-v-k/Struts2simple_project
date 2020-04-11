package com.struts2.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2.DB.users_dao.DaoCardsDB;
import com.struts2.beans.Card;

public class CardsDB implements DaoCardsDB{
	private static final Map<String, Card> _mapCards = new HashMap<String, Card>(0);
	private static final Map<String, Map<String, Card>> _userCardMap = new HashMap<String, Map<String,Card>>(0);
	
	@Override
	public Map<String, Card> getCardMap(final String userName) {
		return _userCardMap.get(userName);
	}
	
	@Override
	public void addCardFormDB() {
		System.out.println(" ---- ");
	}
	
	@Override
	public void deleteCardFromDB(final String userName, final String cardName) {
		_userCardMap.get(userName).get(cardName);
	}
}
