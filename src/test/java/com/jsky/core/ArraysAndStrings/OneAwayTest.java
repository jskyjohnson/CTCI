package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.5 One Away
 * There are three types of edits that can be performed on strings,
 * insert, remove, or replace. Given two strings write a function to
 * check if they are one edit away
 */


public class OneAwayTest {
	@DisplayName("One Away Test")
	@Test
	public void testPalindrome() {
		assertEquals(true, OneAway.checkOneAway("pale", "ple"));
		assertEquals(true, OneAway.checkOneAway("pales", "pale"));
		assertEquals(true, OneAway.checkOneAway("pale" , "bale"));
		assertEquals(false, OneAway.checkOneAway("pale" ,"bake"));
  }
	
}

