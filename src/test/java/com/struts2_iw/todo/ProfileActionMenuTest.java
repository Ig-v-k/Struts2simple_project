package com.struts2_iw.todo;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;

public class ProfileActionMenuTest {
	private static Logger LOGGER;
	
	@BeforeClass
	public static void beforeClass() {
		LOGGER = Logger.getLogger(ProfileActionMenuTest.class.getName());
	}
	
	@Test
	public void testConvertCardName() {
		LOGGER.info("--- LOGGER: <testConvertCardName>");

		assertTrue(" assertTrue ---> ", new ProfileValidateData().validate_cardNamber("1234123412341234"));
		
		assertFalse(" assertFalse ---> ", new ProfileValidateData().validate_cardNamber("123412341234123"));

		assertFalse(" assertFalse ---> ", new ProfileValidateData().validate_cardNamber("12341234123412a4"));
		
		assertFalse(" assertFalse ---> ", new ProfileValidateData().validate_cardNamber("1234123412/41234"));
		
		assertFalse(" assertFalse ---> ", new ProfileValidateData().validate_cardNamber("123412341  41234"));
	}
}
