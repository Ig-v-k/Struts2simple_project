package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.MethodsCardName;

public class ActCardNameIntegerArray implements MethodsCardName{
	private static final Logger LOGGER = Logger.getLogger(ActCardNameIntegerArray.class.getName());
	private MethodsCardName methodsCardName;
	
	public ActCardNameIntegerArray(MethodsCardName methodsCardName) {
		LOGGER.info("--- LOGGER: constructor() ");
		this.methodsCardName = methodsCardName;
	}
	
	@Override
	public ActCardNameVars getCardName() {
		LOGGER.info("--- LOGGER: method() ");
		actCardNameVars.numberEnd = 4;
		for(int i = 0; i < 4; i++) {
			if(i > 0) {
				actCardNameVars.numberStart = actCardNameVars.numberStart + 4;
			}
			actCardNameVars.arrayNumbers[i] = this.methodsCardName.getCardName().cardNameNumberFour;
			actCardNameVars.numberEnd = actCardNameVars.numberEnd + 4;
		}
		return actCardNameVars;
	}
}
