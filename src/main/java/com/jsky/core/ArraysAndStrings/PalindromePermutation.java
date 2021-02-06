package com.jsky.core.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PalindromePermutation {

  public static boolean checkIfPalindromePermutation(String input) {
    //edit values of input
    String ipstring = input.toLowerCase().replaceAll("\\s", "");

    //I can just use a set
    //Letter, Count that appears
    HashMap<Character, Integer> mp = new HashMap<>();

    for (char c : ipstring.toCharArray()) {
      mp.put(c, mp.getOrDefault(c, 0) + 1);
    }

    //Make sure there's only 1 or 0 odd values...
    System.out.println(mp);
    //Set<Integer> mpi = mp.values();

    boolean oddFound = false;
    //for (Integer i : mpi) {}

    for (Map.Entry<Character, Integer> set : mp.entrySet()) {
      // Printing all elemnts of a Map
			if(set.getValue() % 2 == 1){
				if(oddFound) return false;
				oddFound = true;
			}
    }

    return true;
  }
}
