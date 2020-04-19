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
		
//		boolean[] a1 = new boolean[1];
		boolean[] a2 = new boolean[1];
		
//		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("1234123412341234");
		assertTrue(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
//		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("123412341234123");
		assertFalse(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
//		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("12341234123412a4");
		assertFalse(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
//		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("1234123412/41234");
		assertFalse(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
//		a1[0] = true;
		a2[0] = new ProfileActionMenu().convertCardName("123412341  41234");
		assertFalse(" assertTrue ---> ", a2[0]);
//		assertArrayEquals(a1, a2);
		
	}
}
