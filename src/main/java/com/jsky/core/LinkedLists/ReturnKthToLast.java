package com.jsky.core.LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReturnKthToLast {

  /**
   * @param list, A linked list
   * @return A linked list with duplicate values removed.
   */

  public static Object returnKthToLast(LinkedList list, int ret) {
		Object retVal = null;
		ListIterator<Object> iter = list.listIterator(list.size());

		int index = 0;
		while( index < ret &&  iter.hasPrevious()){
			retVal = iter.previous();
			index++;
		}

    return retVal;
  }
  public static void main(String[] args) {
    LinkedList<String> sample = new LinkedList<String>();
    sample.add("s");
    sample.add("s");
    sample.add("a");
    sample.add("m");
    sample.add("p");
    sample.add("l");
  	sample.add("e");
  	sample.add("s");

    String s = (String) returnKthToLast(sample, 2);
		System.out.println(s);
  }
}
