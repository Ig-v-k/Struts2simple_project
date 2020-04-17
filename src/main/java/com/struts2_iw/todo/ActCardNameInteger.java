package com.struts2_iw.todo;

import com.struts2_iw.interfaces.MethodsCardName;

public final class ActCardNameInteger implements MethodsCardName{
	@Override
	public ActCardNameVars getCardName(final String cardName) {
		actCardNameVars.cardName = new StringBuilder(cardName);
		actCardNameVars.cardNameNumberFour = Integer.parseInt(actCardNameVars.cardName.substring(actCardNameVars.numberStart, actCardNameVars.numberEnd));
		return actCardNameVars;
	}
}
