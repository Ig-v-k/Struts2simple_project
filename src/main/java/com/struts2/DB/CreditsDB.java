package com.struts2.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2.beans.Credit;

public class CreditsDB {
	private static final Map<String, Credit> _initCreditsMap = new HashMap<String, Credit>(0);
	
	public static Map<String, Credit> returnMapCredits() {
		return _initCreditsMap;
	}
}
