package com.jsky.core.ArraysAndStrings;

import java.util.Arrays;

public class URLify {

  /**
   *
   * @param s, a string to be turned into a URL with empty space
   * @param n, a number presenting the original length of the "string"
   * @return A string value of the new URL edited in place.
   */

  public static String URLify(String s, int n) {
		char[] url = s.toCharArray();
		
    //Start from the end and fill the array.
    int k = s.length() - 1;
    for (int i = n - 1; i >= 0; i--) {
      if (url[i] == ' ') {
        url[k] = '0';
        url[k - 1] = '2';
        url[k - 2] = '%';
        k -= 3;
      } else {
        url[k] = url[i];
        k--;
      }
		}
    return new String(url);
  }

  // public static void main(String[] args) {
  //   String str = URLify("Mr John Smith    ", 13);

  //   System.out.println(str);
  // }
}
