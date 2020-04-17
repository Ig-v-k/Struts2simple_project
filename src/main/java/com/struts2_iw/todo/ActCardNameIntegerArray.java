package com.struts2_iw.todo;

import com.struts2_iw.interfaces.MethodsCardName;

public class ActCardNameIntegerArray implements MethodsCardName{
	private MethodsCardName methodsCardName;
	
	public ActCardNameIntegerArray(MethodsCardName methodsCardName) {
		this.methodsCardName = methodsCardName;
	}
	
	@Override
	public ActCardNameVars getCardName(final String cardName) {
		actCardNameVars.numberEnd = 3;
		for(int i = 0; i < 3; i++) {
			if(i > 0) {
				actCardNameVars.numberStart = actCardNameVars.numberStart + 4;
			}
			actCardNameVars.arrayNumbers[i] = this.methodsCardName.getCardName(cardName).cardNameNumberFour;
			actCardNameVars.numberEnd = actCardNameVars.numberEnd + 4;
		}
		return actCardNameVars;
	}
}
