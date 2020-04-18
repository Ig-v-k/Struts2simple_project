package com.struts2_iw.todo;

import java.util.logging.Logger;

import com.struts2_iw.interfaces.MethodsCardName;

public class ActCardNameIntegerFourBoolean implements MethodsCardName{
	private static final Logger LOGGER = Logger.getLogger(ActCardNameIntegerFourBoolean.class.getName());
	private MethodsCardName methodsCardName;
	
	public ActCardNameIntegerFourBoolean(MethodsCardName methodsCardName) {
		LOGGER.info("--- LOGGER: constructor()");
		this.methodsCardName = methodsCardName;
	}
	
	@Override
	public ActCardNameVars getCardName() {
		LOGGER.info("--- LOGGER: method() ");
		if (this.checkArrayNumbersCorrectlly(
				this.methodsCardName.getCardName().arrayNumbers)) {
			actCardNameVars.isArrayHasNumbers = true;
			return actCardNameVars;
		}
		return actCardNameVars;
	}
	
	private boolean checkArrayNumbersCorrectlly(final int[] arrayCardNumber) {
		LOGGER.info("--- LOGGER: method() ");
		LOGGER.info("--- LOGGER: arrayCardNumber ---> " + arrayCardNumber[0] 
				+ " - " 
				+ arrayCardNumber[1]
				+ " - "
				+ arrayCardNumber[2]
				+ " - "
				+ arrayCardNumber[3]);
		int flag = 0;
		if(arrayCardNumber.length == 4) {
			for(int i = 0; i < arrayCardNumber.length; i++) {
				if((arrayCardNumber[i] < 9999) && (arrayCardNumber[i] > 0000))
					flag++;
			}
		}
		return (flag == 4) ? true : false;
	}
}
