package com.jsky.core.LinkedLists;

import com.jsky.core.Utils.ListNode;

public class DeleteMiddleNode {
	public static void DeleteMiddleNode(ListNode node){
		//Delete this node... so
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
