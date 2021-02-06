package com.jsky.core.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

	/**
   * @param input, a string to check it's palindromeisty
   * @return if the string is a palindrome permuation
   */

  public static boolean checkIfPalindromePermutation(String input) {
    //edit values of input to lowercase and remove all spaces
    String inputString = input.toLowerCase().replaceAll("\\s", "");

    //Create a hashmap from string, <Letter, Count that appears>
    HashMap<Character, Integer> mp = new HashMap<>();
    for (char c : inputString.toCharArray()) {
      mp.put(c, mp.getOrDefault(c, 0) + 1);
    }

    //Make sure there's only 1 or 0 odd values...
    boolean oddFound = false;
    for (Map.Entry<Character, Integer> set : mp.entrySet()) {
			if(set.getValue() % 2 == 1){
				if(oddFound) return false;
				oddFound = true;
			}
    }

    return true;
  }
}
