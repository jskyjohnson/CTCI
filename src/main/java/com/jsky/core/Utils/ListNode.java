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
}
