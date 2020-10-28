package com.jsky.core.ArraysAndStrings;

/**
 * Question 1.1 IsUnique
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class IsUnique {

  /**
   *
   * @param s, a string of values between A - 0...
   * @return boolean value for if the string is unique or not
   */
  public static boolean isUnique(String s) {
    int checker = 0;
    for (int i = 0; i < s.length(); i++) {
      int val = s.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) return false;
      checker |= (1 << val);
    }
    return true;
  }
}
