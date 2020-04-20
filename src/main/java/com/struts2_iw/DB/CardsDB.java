package com.struts2_iw.DB;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.struts2_iw.DB.users_dao.DaoCardsDB;
import com.struts2_iw.beans.Card;

public class CardsDB implements DaoCardsDB{
	// key: <userName> value: <Card>
	private static final Map<String, Card> _mapCards = new HashMap<String, Card>(0);
	
	// key: <firstName + lastName> value: <mapCards>
	private static final Map<String, Map<String, Card>> _userCardMap = new HashMap<String, Map<String,Card>>(0);
	
	@Override
	public Map<String, Card> getCardMap(final String userName) {
		return _userCardMap.get(userName);
	}
	
	@Override
	public void addCardFormDB(
			final String userFULLname, 
			final int[] card_number_int_array,
			final int i) {
		this._mapCards.put(userFULLname, 
				new Card("OOO POKO", 
						card_number_int_array,
						(byte)123,
						i, 
						"Credit", 
						userFULLname,
						0,
						true,
						true, 
						true,
						true,
						true, 
						true, 
						true,
						new Date()));
		this._userCardMap.put(
				userFULLname, 
				_mapCards);
	}
	
	@Override
	public void deleteCardFromDB(final String userName, final String cardName) {
		_userCardMap.get(userName).get(cardName);
	}
}
