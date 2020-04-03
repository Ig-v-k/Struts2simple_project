package com.struts2.DB;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Transfer;

public class TransfersDB {
	private static final Map<String, Transfer> _initTransfersMap = new HashMap<String, Transfer>();
	
	static {
		initMap();
	}
	private static void initMap() {
		Date date = new Date();
		
		_initTransfersMap.put("a", new Transfer(date.toString(),
				 						new CardsDB().returnMapCard().get("a"), 
				 						new UsersDB().returnMapUsers("user").get("userqwe")));
	}
	
	public Map<String, Transfer> returnMapTransfer() {
		return this._initTransfersMap;
	}
}
