package com.struts2.beans;

public class Card {
	private String cardName = "";
	private String cardType = "";
	private String userPhone = "";
	
	public Card(String cardName, String cardType, String userPhone) {
		this.cardName = cardName;
		this.cardType = cardType;
		this.userPhone = userPhone;
	}
	
	public String getCardName() {
		return cardName;
	}
	
	public String getCardType() {
		return cardType;
	}
	
	public String getUserPhone() {
		return userPhone;
	}
	
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
}
