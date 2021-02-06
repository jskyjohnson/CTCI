package com.jsky.core.ArraysAndStrings;

public class StringCompression {

	/**
   * @param input, a string to compress
   * @return a compressed string.
   */
  public static String compressString(String input) {
    char curr = input.charAt(0);
    StringBuilder str = new StringBuilder();
    int charcount = 0;
    for (char c : input.toCharArray()) {
      if (c != curr) {
        //New character
        str.append(curr);
        str.append(charcount);
        charcount = 1;
        curr = c;
      } else {
        charcount++;
      }
    }

    //Do the last value too
    str.append(curr);
    str.append(charcount);

    if(str.length() > input.length()) return input;
    return str.toString();
  }
}
