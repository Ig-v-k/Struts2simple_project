package com.struts2.DB;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Credit;

public class CreditsDB {
	private static final Map<String, Credit> _initCreditsMap = new HashMap<String, Credit>();
	
	static {
		initMap();
	}
	private static void initMap() {
		Date date = new Date();
		
		_initCreditsMap.put("a", new Credit(new CardsDB().returnMapCard().get("a"),
									new UsersDB().returnMapUsers("user").get("userqwe"),
									0,
									date.toString(),
									"Bank SAKOP"));
	}
	
	public Map<String, Credit> returnMapTransfer() {
		return this._initCreditsMap;
	}
}
