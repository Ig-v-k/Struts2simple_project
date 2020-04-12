package com.struts2_iw.DB;

import java.util.HashMap;
import java.util.Map;

import com.struts2_iw.DB.users_dao.DaoTransfersDB;
import com.struts2_iw.beans.Transfer;

public final class TransfersDB implements DaoTransfersDB{
	private static final Map<String, Transfer> _initTransfersMap = new HashMap<String, Transfer>(0);
	
	@Override
	public Transfer getUserTransfer(String username) {
		return _initTransfersMap.get("username");
	}
}