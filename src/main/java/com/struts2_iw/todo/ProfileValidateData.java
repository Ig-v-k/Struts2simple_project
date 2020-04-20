package com.struts2_iw.todo;

import java.util.logging.Logger;

public final class ProfileValidateData {
	private static final Logger LOGGER = Logger.getLogger(ProfileValidateData.class.getName());
	
	public ActCardNameVars validate_cardNamber(final String card_number) {
		return new ActCardNameIsSize(
				new ActCardNameIntegerFourBoolean(
					new ActCardNameIntegerArray(
						new ActCardNameInteger())), card_number).getCardName();
	}
	
	public boolean validate_userFULLname_size(final String name) {
		return name.length() >= 3 && name.length() <= 20;
	}
}
