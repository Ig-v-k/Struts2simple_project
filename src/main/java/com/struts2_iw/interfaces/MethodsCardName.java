package com.struts2_iw.interfaces;

import com.struts2_iw.todo.ActCardNameVars;

public interface MethodsCardName {
	ActCardNameVars actCardNameVars = new ActCardNameVars();
	ActCardNameVars getCardName(final String cardName);
}
