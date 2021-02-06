package com.jsky.core.ArraysAndStrings;

public class OneAway {

  /**
   * @param input, an input string to compare
   * @param check, a check string to compare the input too
   * @return if the string is one edit away
   */

  public static boolean checkOneAway(String check, String input) {
    //I can either, replace, remove, or insert a value.
    //remove and insert are both (basically) the same thing

    //Check that check and input are within 1 of each other.
    int a = check.length();
    int b = input.length();
    if (Math.abs(a - b) > 1) return false;

    if (a == b) return checkReplace(check, input);
    if (a > b) return checkInsert(check, input); //check string is longer than input
    else return checkInsert(input, check); //input is longer than check
  }

  /**
   * @param a, A string
   * @param b, Another string
   * @return if string a can replace 1 letter to be string b
   */

  public static boolean checkReplace(String a, String b) {
    // Since most values should be the same, we can just scan
    // through both at the same time and replace the first different
    // value in b, then they should be the same string else return false
    boolean rep = false;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) != b.charAt(i)) {
        if (rep) return false;
        rep = true;
      }
    }
    return true;
  }

  /**
   * @param ls, A string 1 value longer than ss
   * @param ss, A string 1 shorter than ls
   * @return if sting ss can insert 1 letter to become ls
   */
	
  public static boolean checkInsert(String ls, String ss) {
    // Similar to replace, except now we can add the missing value
    // at index in ss

    int increment = 0;
    boolean inserted = false;
    for (int i = 0; i < ss.length(); i++) {
      if (ls.charAt(i) != ss.charAt(i - increment)) {
        if (inserted) return false;
        increment++;
        inserted = true;
      }
    }
    return true;
  }
}
