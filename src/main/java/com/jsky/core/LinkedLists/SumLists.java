package com.jsky.core.LinkedLists;

import com.jsky.core.Utils.ListNode;

public class SumLists {

  /**
   * @param l1, List 1 in reverse order
   * @param l2, List 2 in reverse order
   * @return returns a list of digits added together (in reverse order...)
   */
  public static ListNode<Integer> sumListsReverse(
    ListNode<Integer> l1,
    ListNode<Integer> l2
  ) {
    ListNode<Integer> l1cur = l1;
    ListNode<Integer> l2cur = l2;
    ListNode<Integer> ret_head = new ListNode<Integer>();
    ListNode<Integer> ret_cur = ret_head;

    boolean carry = false;
    while (l1cur != null || l2cur != null) {
      int nextval =
        (l1cur != null ? l1cur.val : 0) +
        (l2cur != null ? l2cur.val : 0) +
        (carry ? 1 : 0);
      carry = false;
      if (nextval >= 10) {
        nextval %= 10;
        carry = true;
      }
      ListNode<Integer> next = new ListNode<Integer>(nextval);
      ret_cur.next = next;
      if (l1cur != null) l1cur = l1cur.next;
      if (l2cur != null) l2cur = l2cur.next;

      ret_cur = ret_cur.next;
    }
    if (carry) {
      ret_cur.next = new ListNode<Integer>(1);
    }

    return ret_head.next;
  }

  /**
   * Same as reverse except inputs are in forward order
   * @param l1 to be added with digits in forward order
   * @param l2 to be added with digits in forward order
   * @return returns l1 + l2 in forward order digits.
   */
  public static ListNode<Integer> sumListsForward(
    ListNode<Integer> l1,
    ListNode<Integer> l2
  ) {
		ListNode<Integer> l1cur = ListNode.reverse(l1);
		ListNode<Integer> l2cur = ListNode.reverse(l2);

		
		ListNode<Integer> answer = sumListsReverse(l1cur, l2cur);

    return ListNode.reverse(answer);
  }
}
