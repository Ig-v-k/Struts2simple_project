package com.struts2_iw.todo;

import java.util.logging.Logger;

public final class ActCardNameVars {
	private static final Logger LOGGER = Logger.getLogger(ActCardNameVars.class.getName());
	public StringBuilder cardName = null;
	public final int[] arrayNumbers = new int[4];
	public int cardNameNumberFour = 0;
	public boolean isArrayHasNumbers = false;
	public int numberStart = 0;
	public int numberEnd = 4;
	public boolean isSize = false;
	
	public ActCardNameVars() {
		LOGGER.info("--- LOGGER: <constructor>");
	}
}
