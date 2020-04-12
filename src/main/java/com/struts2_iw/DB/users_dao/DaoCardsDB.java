package com.struts2_iw.DB.users_dao;

import java.util.Map;

import com.struts2_iw.beans.Card;

public interface DaoCardsDB {
	void deleteCardFromDB(final String userName, final String cardName);
	void addCardFormDB();
	Map<String, Card> getCardMap(String userName);
}
