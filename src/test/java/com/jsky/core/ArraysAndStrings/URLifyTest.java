package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.3 URLify
 * Write a method to replace all spaces in a string with '%20',
 * Assume the string has sufficient space at the end to hold the additional characters
 * Use a character array so that you can perform this operation in place.
 */


public class URLifyTest {
	@DisplayName("URLify Testing")
	@Test
	public void testURLify() {
    assertEquals("Mr%20John%20Smith", URLify.URLify("Mr John Smith    ", 13)); //Notice the 4 spaces at the end...
  }
	
}

