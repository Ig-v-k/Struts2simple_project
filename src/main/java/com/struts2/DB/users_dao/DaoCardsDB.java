package com.struts2.DB.users_dao;

import java.util.Map;

import com.struts2.beans.Card;

public interface DaoCardsDB {
	void deleteCardFromDB(final String userName, final String cardName);
	void addCardFormDB();
	Map<String, Card> getCardMap(String userName);
}
