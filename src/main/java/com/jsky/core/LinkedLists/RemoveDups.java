package com.jsky.core.LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveDups {
  /**
   * @param list, A linked list
   * @return A linked list with duplicate values removed.
   */

  public static LinkedList removeDups(LinkedList list) {
		int index = 0;
		ListIterator<Object> listIterator = list.listIterator();
		while(listIterator.hasNext()){
			Object t = listIterator.next();
			//Checks if it's the only occurance of that value
			if( index != list.lastIndexOf(t) ) {
				//Create a new list iterator to avoid concurrent modification errors
				ListIterator<Object> remover = listIterator;
				while(remover.hasNext()){
					Object lt = remover.next();
					if(lt.equals(t)){
						remover.remove();
					}
				}
			};
			index++;
		}
		return list;
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

    LinkedList<String> s = removeDups(sample);
    System.out.println(s);
  }
}
