package org.zhenghu.leetcode.linkedlist.deletenodeinlinkedlist;

/**
 * Delete node in a linked list solution
 */
public class DeteleNodeInLinkedList {

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
