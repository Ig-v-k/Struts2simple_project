package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.MethodsCardName;

public final class ActCardNameInteger implements MethodsCardName{
	private static Logger LOGGER = Logger.getLogger(ActCardNameInteger.class.getName());
	
	public ActCardNameInteger() {
		LOGGER.info("--- LOGGER: constructor() ");
	}
	
	@Override
	public ActCardNameVars getCardName() {
		LOGGER.info("--- LOGGER: method() ");
		actCardNameVars.cardNameNumberFour = Integer.parseInt(
				actCardNameVars.cardName.substring(
						actCardNameVars.numberStart, 
						actCardNameVars.numberEnd
						)
				);
		return actCardNameVars;
	}
}
