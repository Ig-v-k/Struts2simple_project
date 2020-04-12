package com.struts2_iw.beans;

public class Credit {
	private Card _card;
	private User _user;
	private int creditState = 0;
	private String date;
	private String firmName = "";
	
	public Credit(Card _card, User _user, int creditState, String date, String firmName) {
		this._card = _card;
		this._user = _user;
		this.creditState = creditState;
		this.date = date;
		this.firmName = firmName;
	}

	public Card get_card() {
		return _card;
	}

	public User get_user() {
		return _user;
	}

	public int getCreditState() {
		return creditState;
	}

	public String getDate() {
		return date;
	}

	public String getFirmName() {
		return firmName;
	}
	
	
}
