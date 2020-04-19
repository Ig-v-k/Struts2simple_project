package com.struts2_iw.beans;

import java.util.Date;
import java.util.logging.Logger;

public class Card {
	private static final Logger LOGGER = Logger.getLogger(Card.class.getName());
	private String bank = "";
	private String numberCard = "";
	private String numberCVC = "";
	private String typeCard = "";
	private String userName = "";
	private int state = 0;
	private boolean evmChip = false;
	private boolean contactlessChip = false;
	private boolean hologram = false;
	private boolean cardNetLogo = false;
	private boolean magneticStripe = false;
	private boolean signatureStripe = false;
	private boolean secCode = false;
	private Date date;
	
	public Card(String bank, 
			String numberCard, 
			String numberCVC,
			String typeCard,
			String userName, 
			int state, 
			boolean evmChip,
			boolean contactlessChip, 
			boolean hologram, 
			boolean cardNetLogo, 
			boolean magneticStripe,
			boolean signatureStripe, 
			boolean secCode, 
			Date date) {
		this.bank = bank;
		this.numberCard = numberCard;
		this.typeCard = typeCard;
		this.userName = userName;
		this.state = state;
		this.evmChip = evmChip;
		this.contactlessChip = contactlessChip;
		this.hologram = hologram;
		this.cardNetLogo = cardNetLogo;
		this.magneticStripe = magneticStripe;
		this.signatureStripe = signatureStripe;
		this.secCode = secCode;
		this.date = date;
	}
	
	public String getBank() {
		return bank;
	}
	public String getNumberCard() {
		return numberCard;
	}
	public String getNumberCVC() {
		return numberCVC;
	}
	public String getTypeCard() {
		return typeCard;
	}
	public String getUserName() {
		return userName;
	}
	public int getState() {
		return state;
	}
	public boolean isEvmChip() {
		return evmChip;
	}
	public boolean isContactlessChip() {
		return contactlessChip;
	}
	public boolean isHologram() {
		return hologram;
	}
	public boolean isCardNetLogo() {
		return cardNetLogo;
	}
	public boolean isMagneticStripe() {
		return magneticStripe;
	}
	public boolean isSignatureStripe() {
		return signatureStripe;
	}
	public boolean isSecCode() {
		return secCode;
	}
	public Date getDate() {
		return date;
	}
}