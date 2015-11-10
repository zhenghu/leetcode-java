package org.zhenghu.leetcode.linkedlist.deletenodeinlinkedlist;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

/**
 * Delete node in a linked list solution
 */
public class DeteleNodeInLinkedList {

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public LinkedList<Integer> removeDuplicationUnsortedLinkedList(LinkedList<Integer> list) {
		LinkedHashSet<Integer> listNoDuplication = new LinkedHashSet<>();
		while (list.size() > 0) {
			listNoDuplication.add(list.getFirst());
			list.remove(0);
		}

		return new LinkedList(Arrays.asList(listNoDuplication.toArray()));

	}

	public LinkedList<Integer> removeDuplicationUnsortedLinkedListWithHashMap(LinkedList<Integer> list) {
		Map<Integer, Integer> indexMap = new HashMap<>();
		int pointer = 0;
		while (pointer < list.size()) {
			if (indexMap.containsKey(list.get(pointer))) {
				list.remove(pointer);
				pointer--;
			} else {
				indexMap.put(list.get(pointer), 0);
			}
			pointer++;
		}
		return list;
	}
}
