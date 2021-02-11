package com.jsky.core.LinkedLists;

import com.jsky.core.Utils.ListNode;

public class Palindrome {

  public static boolean isPalindrome(ListNode<String> list) {
    ListNode<String> rev = ListNode.reverseStr(list.copy());
    ListNode<String> frd = list.copy();

    while (rev != null && frd != null) {
      if (rev.val != frd.val) return false;
      rev = rev.next;
      frd = frd.next;
    }

    return true;
  }
}
