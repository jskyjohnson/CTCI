package com.jsky.core.ArraysAndStrings;

public class StringRotation {

  public static boolean isRotation(String s1, String s2) {
    if (s1.length() == s2.length() && s1.length() > 0) {
      return isSubstring(s1 + s1, s2);
    }
    return false;
  }

  public static boolean isSubstring(String s1, String s2) {
    return s1.contains(s2);
  }
}
