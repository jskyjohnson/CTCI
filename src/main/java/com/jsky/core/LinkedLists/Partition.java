package com.jsky.core.LinkedLists;

import com.jsky.core.Utils.ListNode;

public class Partition {

  /**
   * @param node,
   */
  public static ListNode<Integer> partitionList(ListNode<Integer> list, int partition) {
    //Create two lists basically...
    ListNode<Integer> prehead = new ListNode();
    ListNode<Integer> pretail = prehead;
    ListNode<Integer> posthead = new ListNode();
    ListNode<Integer> posttail = posthead;

    ListNode<Integer> cur = list;
    while (cur != null) {
      if (cur.val >= partition) {
        //Add it to posttail
        ListNode nxxt = new ListNode(cur.val);
        posttail.next = nxxt;
        posttail = posttail.next;
      }else{
				ListNode nxxt = new ListNode(cur.val);
        pretail.next = nxxt;
        pretail = pretail.next;
			}
			cur = cur.next;
		}
		System.out.print(posthead);
		System.out.println(prehead);
		pretail.next = posthead.next;
		
		return prehead.next;
  }
}
