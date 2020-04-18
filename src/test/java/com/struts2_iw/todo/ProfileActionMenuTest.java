package com.struts2_iw.todo;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;

public class ProfileActionMenuTest {
	private static Logger LOGGER = Logger.getLogger(ProfileActionMenuTest.class.getName());
	
	@BeforeClass
	public static void beforeClass() {
		LOGGER.info("--- LOGGER: <beforeClass>");
	}
	
	@Test
	public void testConvertCardName() {
		LOGGER.info("--- LOGGER: <testConvertCardName>");
		
		boolean[] a1 = new boolean[1];
		boolean[] a2 = new boolean[1];
		
		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("1234123412341234");
		assertTrue(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("1234123412341234");
		assertTrue(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("1234123412341234");
		assertTrue(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("1234123412341234");
		assertTrue(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("1234123412341234");
		assertTrue(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
		a1[0] = false;
		a2[0] = new ProfileActionMenu().convertCardName("0000000000000000");
		assertTrue(" assertFalse ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
	}
}
