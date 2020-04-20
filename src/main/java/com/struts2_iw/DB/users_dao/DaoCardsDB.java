package com.struts2_iw.DB.users_dao;

import java.util.Map;

import com.struts2_iw.beans.Card;

public interface DaoCardsDB {
	void deleteCardFromDB(final String userName, final String cardName);
	Map<String, Card> getCardMap(String userName);
	void addCardFormDB(String userFULLname, int[] card_number_int_array, int i);
}
