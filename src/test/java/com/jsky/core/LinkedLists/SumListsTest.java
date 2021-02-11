package com.jsky.core.LinkedLists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jsky.core.Utils.ListNode;
import java.util.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 2.5 Given lists in digits order (reversed) add them and return another list
 * Assume inputs are equal length (for now);
 */

public class SumListsTest {

  @DisplayName("Sum List Tests Reverse Order")
  @Test
  public void TestReverseOrder() {
    ListNode<Integer> l1 = ListNode.listFromIntArray(new int[] { 7, 1, 6 });

    ListNode<Integer> l2 = ListNode.listFromIntArray(new int[] { 5, 9, 2 });

    ListNode<Integer> answer = ListNode.listFromIntArray(new int[] { 2, 1, 9 });
    
    ListNode<Integer> processed = SumLists.sumListsReverse(l1, l2);
    System.out.println(processed);
    System.out.println(answer);
    assertEquals(true, processed.equals(answer));
  }

  @DisplayName("Sum List Tests Reverse Order Uneven numbers")
  @Test
  public void TestReverseOrderUneven() {
    ListNode<Integer> l1 = ListNode.listFromIntArray(new int[] { 9, 9, 9, 9, 9, 9, 9 });

    ListNode<Integer> l2 = ListNode.listFromIntArray(new int[] { 9, 9, 9, 9 });

    ListNode<Integer> answer = ListNode.listFromIntArray(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 });
    
    ListNode<Integer> processed = SumLists.sumListsReverse(l1, l2);
    System.out.println(processed);
    System.out.println(answer);
    assertEquals(true, processed.equals(answer));
  }

  @DisplayName("Sum List Tests In Forward Order")
  @Test
  public void TestForwardOrder() {
    ListNode<Integer> l1 = ListNode.listFromIntArray(new int[] { 6, 1, 7 });

    ListNode<Integer> l2 = ListNode.listFromIntArray(new int[] { 2, 9, 5 });

    ListNode<Integer> answer = ListNode.listFromIntArray(new int[] { 9, 1, 2 });
    
    ListNode<Integer> processed = SumLists.sumListsForward(l1, l2);

    assertEquals(true, processed.equals(answer));
  }
}
