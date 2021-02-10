package com.jsky.core.LinkedLists;

import com.jsky.core.Utils.ListNode;

public class DeleteMiddleNode {
	/**
   * @param node, a listnode object to get deleted from a longer list node
   */
	public static void DeleteMiddleNode(ListNode node){
		//Delete this node... just move this node's values to the next
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
