package com.struts2.DB.users_dao;

import com.struts2.beans.Transfer;

public interface DaoTransfersDB {
	Transfer getUserTransfer(final String username);
}
