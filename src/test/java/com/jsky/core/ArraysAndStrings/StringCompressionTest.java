package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.6 String Compression
 * Implement a method to perform basic string compression using the
 * counts of repeated characters. If the compressed string would not
 * become smaller than the original, your method should return the original
 */

public class StringCompressionTest {

  @DisplayName("String Compression Test")
  @Test
  public void testPalindrome() {
    assertEquals("a2b1c5a3", StringCompression.compressString("aabcccccaaa"));
  }
}
