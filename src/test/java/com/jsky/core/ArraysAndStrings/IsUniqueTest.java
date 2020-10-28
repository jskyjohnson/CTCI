package com.jsky.core.ArraysAndStrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 1.1 IsUnique
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class IsUniqueTest {

  @DisplayName("Is Unique Testing")
  @Test
  public void testIsUnique() {
    assertEquals(false, IsUnique.isUnique("hello"));
    assertEquals(true, IsUnique.isUnique("abcd"));
    assertEquals(true, IsUnique.isUnique("12savd45"));
  }
}
