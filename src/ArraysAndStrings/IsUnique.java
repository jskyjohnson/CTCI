import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Question 1.1 IsUnique
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 */
public class IsUnique {
	public static void main(String[] args){
		System.out.println("Hello");
	}

	/**
	 * 
	 * @param s, a string of values between A - 0...
	 * @return boolean value for if the string is unique or not
	 */
	public boolean isUnique(String s){
		int checker = 0;
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}

	@Test
	public void testIsUnique(){
		assertEquals(false, isUnique("hello"));
		assertEquals(true, isUnique("abcd"));
		assertEquals(true, isUnique("12savd45"));

	}
}