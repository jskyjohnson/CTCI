package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.2 CheckPermutation
 * Checks if strings are permutations of eachother
 */
public class CheckPermutationTest {

  @DisplayName("Check Permutation Test")
  @Test
  public void checkPermutationTest() {
    assertEquals(false, CheckPermutation.checkPermutation("hello", "hillo"));
    assertEquals(true, CheckPermutation.checkPermutation("hello", "olleh"));
    assertEquals(false, CheckPermutation.checkPermutation("thisisfalse","asitshouldbe"));
  }
}
