package com.jsky.core.LinkedLists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Question 2.2 Return Kth to Last
 * Implement an algorithm to find the kth to last element of a singly linked list
 */
public class ReturnKthToLastTest {

  @DisplayName("Return Kth To Last Test")
  @Test
  public void testReturnKthToLast() {
    LinkedList<String> sample = new LinkedList<String>();
    sample.add("s");
    sample.add("a");
    sample.add("m");
    sample.add("p");
    sample.add("l");
    sample.add("e");

    assertEquals(true, "l".equals(ReturnKthToLast.returnKthToLast(sample, 2)));
  }
}
