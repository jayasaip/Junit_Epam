package com.epam.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringManipulateTest {
	/*
	 * Remove 'A' if it present in first 2 characters 
	 * 1. A in first position, ABCD = BCD
	 * 2. A in first 2 positions, AACD = CD
	 * 3. A in Second position, BACD = BCD
	 * 4. A present in last 2 positions, BBAA = BBAA
	 * 5. A present in first 2 and last 2 positions AABAA = BAA
	 */
	StringManipulate SM;
	
	@Before
	public void before(){
		SM = new StringManipulate();
	}
	
	@Test
	public void testRemoveAInFirst2Positons_AinFirstPosition() {
		assertEquals("BCD",SM.removeAInFirst2Positions("ABCD"));
	}
	@Test
	public void testRemoveAInFirst2Positons_AinFirst2Positions() {
		assertEquals("CD",SM.removeAInFirst2Positions("AACD"));
	}
	@Test
	public void testRemoveAInFirst2Positons_AinSecondPosition() {
		assertEquals("BCD",SM.removeAInFirst2Positions("BACD"));
	}
	@Test
	public void testRemoveAInFirst2Positons_AinLast2Positions() {
		assertEquals("BBAA",SM.removeAInFirst2Positions("BBAA"));
	}
	@Test
	public void testRemoveAInFirst2Positons_AinFirst2AndLast2Positons() {
		assertEquals("BAA",SM.removeAInFirst2Positions("AABAA"));
	}

}
