package com.jsky.core.Utils;

public class ListNode<T> {

  public T val;
  public ListNode<T> next;

  public ListNode() {}

  public ListNode(T x) {
    val = x;
  }

  public ListNode(T x, ListNode<T> next) {
    val = x;
    this.next = next;
  }

  @Override
  public String toString() {
    if (this.next != null) return val + " -> " + next.toString(); else return (
      val + " ;"
    );
  }

  /**
   * @param arr, integer array to be turned into a list
   * @return returns the head of a new list
   */
  public static ListNode<Integer> listFromIntArray(int[] arr) {
    ListNode<Integer> head = new ListNode<Integer>();
    ListNode<Integer> prev = head;
    for (int i : arr) {
      ListNode<Integer> cur = new ListNode<Integer>(i);
      prev.next = cur;
      prev = cur;
    }
    head = head.next;
    return head;
  }

  /**
   * Tests this ListNode to see if it is equal to another ListNode
   * @param o other ListNode
   * @return if they are equal
   */
  public boolean equals(ListNode<T> o) {
    ListNode<T> curOrg = this;
    ListNode<T> curAns = o;
    boolean equal = true;

    while (curAns != null && curOrg != null) {
      if (!curOrg.val.equals(curAns.val)) equal = false;
      curAns = curAns.next;
      curOrg = curOrg.next;
    }
    if (curOrg != null && curAns == null) return false;
    if (curAns != null && curOrg == null) return false;

    return equal;
  }
}
