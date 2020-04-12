package com.struts2_iw.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2_iw.beans.Credit;

public class CreditsDB {
	private static final Map<String, Credit> _initCreditsMap = new HashMap<String, Credit>(0);
	
	public static Map<String, Credit> returnMapCredits() {
		return _initCreditsMap;
	}
}
