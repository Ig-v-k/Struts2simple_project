package com.struts2_iw.beans;

import java.util.Date;
import java.util.logging.Logger;

public class Card {
	private static final Logger LOGGER = Logger.getLogger(Card.class.getName());
	private String bank = "";
	private String numberCard = "";
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
		LOGGER.info("--- LOGGER: getBank");
		return bank;
	}
	public String getNumberCard() {
		LOGGER.info("--- LOGGER: getNumberCard");
		return numberCard;
	}
	public String getTypeCard() {
		LOGGER.info("--- LOGGER: getTypeCard");
		return typeCard;
	}
	public String getUserName() {
		LOGGER.info("--- LOGGER: getUserName");
		return userName;
	}
	public int getState() {
		LOGGER.info("--- LOGGER: getState");
		return state;
	}
	public boolean isEvmChip() {
		LOGGER.info("--- LOGGER: isEvmChip");
		return evmChip;
	}
	public boolean isContactlessChip() {
		LOGGER.info("--- LOGGER: isContactlessChip");
		return contactlessChip;
	}
	public boolean isHologram() {
		LOGGER.info("--- LOGGER: isHologram");
		return hologram;
	}
	public boolean isCardNetLogo() {
		LOGGER.info("--- LOGGER: isCardNetLogo");
		return cardNetLogo;
	}
	public boolean isMagneticStripe() {
		LOGGER.info("--- LOGGER: isMagneticStripe");
		return magneticStripe;
	}
	public boolean isSignatureStripe() {
		LOGGER.info("--- LOGGER: isSignatureStripe");
		return signatureStripe;
	}
	public boolean isSecCode() {
		LOGGER.info("--- LOGGER: isSecCode");
		return secCode;
	}
	public Date getDate() {
		LOGGER.info("--- LOGGER: getDate");
		return date;
	}
}
