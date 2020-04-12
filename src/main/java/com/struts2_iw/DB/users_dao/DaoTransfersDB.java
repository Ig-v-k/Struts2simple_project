package com.struts2_iw.DB.users_dao;

import com.struts2_iw.beans.Transfer;

public interface DaoTransfersDB {
	Transfer getUserTransfer(final String username);
}
