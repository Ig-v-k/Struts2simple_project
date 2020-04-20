package com.struts2_iw.beans;

import java.util.Date;
import java.util.logging.Logger;

public class Card {
	private static final Logger LOGGER = Logger.getLogger(Card.class.getName());
	private String bank = "";
	private int[] cardNumberArray = new int[]{0000, 0000, 0000, 0000};
	private int numberCVC = 000;
	private int numberPIN = 0000;
	private String typeCard = "";
	private String userFULLname = "";
	private int state = 0;
	private boolean evmChip = false;
	private boolean contactlessChip = false;
	private boolean hologram = false;
	private boolean cardNetLogo = false;
	private boolean magneticStripe = false;
	private boolean signatureStripe = false;
	private boolean secCode = false;
	private Date date;
	
	public Card(
			String bank, 
			int[] card_number_int_array, 
			byte numberCVC,
			int numberPIN,
			String typeCard,
			String userFULLname,
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
		this.cardNumberArray = card_number_int_array;
		this.numberCVC = numberCVC;
		this.numberPIN = numberPIN;
		this.typeCard = typeCard;
		this.userFULLname = userFULLname;
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
	public int[] getNumberCard() {
		return this.cardNumberArray;
	}
	public int getNumberCVC() {
		return numberCVC;
	}
	public int getNumberPIN() {
		return numberPIN;
	}
	public String getTypeCard() {
		return typeCard;
	}
	public String getUserFULLName() {
		return userFULLname;
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