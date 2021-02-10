package com.jsky.core.LinkedLists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.jsky.core.Utils.ListNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 2.3 Delete Middle Node
 * Implement an algorithm to delete a node in the middle of a singly
 * linked list, given only access to that node
 */

public class DeleteMiddleNodeTest {

  @DisplayName("Delete Middle Node Test")
  @Test
  public void TestPartition() {
    ListNode<String> original = new ListNode<String>("a");
    original.next = new ListNode<String>("b");
    original.next.next = new ListNode<String>("c");
    original.next.next.next = new ListNode<String>("d");
    original.next.next.next.next = new ListNode<String>("e");

    ListNode<String> answer = new ListNode<String>("a");
    answer.next = new ListNode<String>("b");
    answer.next.next = new ListNode<String>("d");
    answer.next.next.next = new ListNode<String>("e");

		DeleteMiddleNode.DeleteMiddleNode(original.next.next); //C node...
		
    ListNode<String> curOrg = original;
    ListNode<String> curAns = answer;
    boolean equal = true;
    while (curAns.next != null) {
			if (curOrg.val != curAns.val) equal = false;
			curAns = curAns.next;
			curOrg = curOrg.next;
    }
    assertEquals(true, equal);
  }
}
