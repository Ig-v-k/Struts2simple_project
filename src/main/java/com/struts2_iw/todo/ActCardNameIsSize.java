package com.struts2_iw.todo;

import java.util.logging.Logger;
import java.util.regex.Pattern;

import com.struts2_iw.interfaces.MethodsCardName;

public class ActCardNameIsSize implements MethodsCardName{
	private static final Logger LOGGER = Logger.getLogger(ActCardNameIsSize.class.getName());
	MethodsCardName methodsCardName;
	private String cardName = "";
	
	public ActCardNameIsSize(MethodsCardName methodsCardName, final String cardName) {
		this.methodsCardName = methodsCardName;
		this.cardName = cardName;
	}
	
	@Override
	public ActCardNameVars getCardName() {
		LOGGER.info("--- LOGGER: cardName.length ---> " + this.cardName.length());
		if(16 == this.cardName.length()) {
			if(this.regexFindCharacters(this.cardName)) {
				actCardNameVars.cardName = new StringBuilder(this.cardName);
				actCardNameVars.isSize = true;
				return this.methodsCardName.getCardName();
			}
			else
				new Exception("CardName, it should not have any characters!");
		}
		else
			new Exception("CardName, it should have size -> 16!");
		return actCardNameVars;
	}
	
	private boolean regexFindCharacters(final String cardName) {
		return Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d").matcher(cardName).matches();
	}
}
