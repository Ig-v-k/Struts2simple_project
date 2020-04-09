package com.struts2.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2.DB.users_dao.DaoTransfersDB;
import com.struts2.beans.Transfer;

public final class TransfersDB implements DaoTransfersDB{
	private static final Map<String, Transfer> _initTransfersMap = new HashMap<String, Transfer>(0);
	
	@Override
	public Transfer getUserTransfer(String username) {
		return _initTransfersMap.get("username");
	}
}