package com.jsky.core.LinkedLists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

/**
 * Question 2.1 Remove Dups
 * Write code to remove duplicates from an unsorted linked list
 * Solve if a temporary buffer is not allowed!
 */

public class RemoveDupsTests {
	@DisplayName("Remove Duplicates Test")
	@Test
	public void testRemoveDups() {
		LinkedList<String> sample = new LinkedList<String>();
		sample.add("s");
		sample.add("s");
		sample.add("a");
		sample.add("m");
		sample.add("p");
		sample.add("l");
		sample.add("e");

		LinkedList<String> answer = new LinkedList<String>();
		answer.add("s");
		answer.add("a");
		answer.add("m");
		answer.add("p");
		answer.add("l");
		answer.add("e");
		
		LinkedList<String> ret = RemoveDups.removeDups(sample);
		assertEquals(true, ret.equals( answer ));
  }
}

