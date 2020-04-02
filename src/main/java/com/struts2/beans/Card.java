package com.struts2.beans;

public class Card {
	private String cardName = "";
	private String cardType = "";
	private String userPhone = "";
	private int state = 0;
	
	public Card(final String cardName, 
			final String cardType, 
			final String userPhone, 
			final Integer state) {
		this.cardName = cardName;
		this.cardType = cardType;
		this.userPhone = userPhone;
		this.state = state;
	}
}
