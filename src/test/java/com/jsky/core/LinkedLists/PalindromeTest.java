package com.jsky.core.LinkedLists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jsky.core.Utils.ListNode;
import java.util.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 2.6 Implement a function to check if a linked list is a palindrome.
 */

public class PalindromeTest {

  @DisplayName("Palindrome Test")
  @Test
  public void TestPalindrome() {
    ListNode<String> palindrome = ListNode.listFromStringArray(
      new String[] { "a", "b", "c", "d", "c", "b", "a" }
    );
    assertEquals(true, Palindrome.isPalindrome(palindrome));
  }

  @DisplayName("Even Palindrome Test")
  @Test
  public void TestEvenPalindrome() {
    ListNode<String> palindrome = ListNode.listFromStringArray(
      new String[] { "a", "b", "c", "d", "d", "c", "b", "a" }
    );
    assertEquals(true, Palindrome.isPalindrome(palindrome));
  }

  @DisplayName("Not Palindrome Test")
  @Test
  public void TestNotPalindrome() {
    ListNode<String> palindrome = ListNode.listFromStringArray(
      new String[] { "a", "b", "c", "a" }
    );
    assertEquals(false, Palindrome.isPalindrome(palindrome));
  }
}
