package com.struts2.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Card;

public class CardsDB {
	private static final Map<String, Card> _initCardsMap = new HashMap<String, Card>();
	
	static {
		initMap();
	}
	private static void initMap() {
		_initCardsMap.put("a", new Card("a", "b", "c", 23));
	}
	
	public static Map<String, Card> returnMapCard() {
		return _initCardsMap;
	}
}
