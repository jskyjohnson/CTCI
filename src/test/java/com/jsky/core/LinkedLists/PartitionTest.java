package com.jsky.core.LinkedLists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jsky.core.Utils.ListNode;
import java.util.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 2.4 Write code to partition a linked list around a value x, st all nodes
 * less than x come before all nodes greater than or equal to x (location of x in right side)
 * is irrelevant.
 */

public class PartitionTest {

  @DisplayName("Partition Test")
  @Test
  public void TestPartition() {
    ListNode<Integer> original = ListNode.listFromIntArray(
      new int[] { 1, 4, 3, 2, 5, 2}
    );

    ListNode<Integer> answer = ListNode.listFromIntArray(
      new int[] { 1, 2, 2, 4, 3, 5 }
    );

    ListNode<Integer> processed = Partition.partitionList(original, 3);

    //Now, make sure that every value after partition is >...

    ListNode<Integer> curOrg = processed;
    ListNode<Integer> curAns = answer;
    boolean equal = true;
    while (curAns.next != null) {
			if (curOrg.val != curAns.val) equal = false;
			curAns = curAns.next;
			curOrg = curOrg.next;
    }

    assertEquals(true, equal);
  }
}
