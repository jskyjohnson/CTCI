package com.jsky.core.ArraysAndStrings;

import java.util.HashMap;

/**
 * Question 1.2 CheckPermutation
 * Checks if two strings are permutations of each other.
 */
public class CheckPermutation {

  /**
   *
   * @param a String 1
   * @param b String 2
   * @return if the strings are permutations of eachother
   */
  public static boolean checkPermutation(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }

    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : a.toCharArray()) {
      int v = map.containsKey(c) ? map.get(c) : 0;
      map.put(c, v + 1);
    }
    for (char c : b.toCharArray()) {
      if (map.containsKey(c)) {
        int v = map.get(c) - 1;
        if (v >= 0) {
          map.put(c, v);
        } else {
          return false;
        }
      } else {
        return false;
      }
    }
    return true;
  }
}
