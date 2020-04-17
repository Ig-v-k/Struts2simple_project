package com.struts2_iw.todo;

import com.struts2_iw.interfaces.MethodsCardName;

public class ActCardNameIntegerFourBoolean implements MethodsCardName{
	private MethodsCardName methodsCardName;
	
	public ActCardNameIntegerFourBoolean(MethodsCardName methodsCardName) {
		this.methodsCardName = methodsCardName;
	}
	
	@Override
	public ActCardNameVars getCardName(final String cardName) {
		if (this.checkArrayNumbersCorrectlly(actCardNameVars.arrayNumbers)) {
			this.methodsCardName.getCardName(cardName).isArrayHasNumbers = true;
			return actCardNameVars;
		}
		return actCardNameVars;
	}
	
	private boolean checkArrayNumbersCorrectlly(final int[] arrayCardNumber) {
		int flag = 0;
		for(int i = 0; i < arrayCardNumber.length; i++) {
			if((arrayCardNumber[i] < 9999) && (arrayCardNumber[i] > 0000))
				flag++;
		}
		return (flag == 4) ? true : false;
	}
}
