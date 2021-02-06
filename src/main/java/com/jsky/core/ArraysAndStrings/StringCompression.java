package com.jsky.core.ArraysAndStrings;

public class StringCompression {
	public static String compressString(String input){

		char curr = input.charAt(0);
		StringBuilder str = new StringBuilder();
		int charcount = 0;
		for(char c : input.toCharArray()){
			if(c != curr){
				//New character
				str.append(curr);
				str.append(charcount);
				charcount = 1;
				curr = c;
			}else{
				charcount++;
			}
		}

		//Do the last value too
		str.append(curr);
		str.append(charcount);

		System.out.println(str);
		return str.toString();
	}
}
