package com.jsky.core.Utils;

public class ListNode<T> {

  public T val;
  public ListNode<T> next;

  public ListNode(T x) {
    val = x;
  }

  @Override
  public String toString() {
    if (this.next != null) return val + " -> " + next.toString(); 
    else return val + " ;";
  }
}
