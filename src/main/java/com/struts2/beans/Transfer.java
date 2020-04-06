package com.struts2.beans;

public class Transfer {
	private String date = "";
	private Card _card;
	private User _user;
	
	public Transfer(final String date, Card _card, User _user) {
		this.date = date;
		this._card = _card;
		this._user = _user;
	}

	public String getDate() {
		return date;
	}

	public Card get_card() {
		return _card;
	}

	public User get_user() {
		return _user;
	}
	
	
}
