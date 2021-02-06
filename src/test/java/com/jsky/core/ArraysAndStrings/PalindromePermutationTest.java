package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.4 Palindrom Permutation
 * Given a string, write a function to check if it is a permutation of a palindrome. 
 * A palindrome is a word or phrase that is the same for/back, Palindrome does not need to be limited to
 * dictionary words. You can ignore casing and non-letter characters.
 */


public class PalindromePermutationTest {
	@DisplayName("Palindrome Permutation Testing")
	@Test
	public void testPalindrome() {
		assertEquals(true, PalindromePermutation.checkIfPalindromePermutation("Tact Coa"));
  }
	
}

