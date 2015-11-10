package org.zhenghu.leetcode.linkedlist.deletenodeinlinkedlist;

import java.util.Arrays;
import java.util.LinkedList;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ZH16093N on 10/11/2015.
 */
public class DeteleNodeInLinkedListTest {

	DeteleNodeInLinkedList deteleNodeInLinkedList;


	private LinkedList expectedLinkenList = new LinkedList(Arrays.asList(new Integer[]{1,3,2,5,4}));
	private LinkedList inputLinkedList = new LinkedList(Arrays.asList(new Integer[]{1,1,3,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,1,5,5,5,5,5,5,4,3,3,3,3,3}));

	@Before
	public void setUp() throws Exception {
		this.deteleNodeInLinkedList = new DeteleNodeInLinkedList();
	}

	@Test
	public void testRemoveDuplicationUnsortedLinkedList() throws Exception {
		// Given
		// When
		LinkedList actualLinkedList = this.deteleNodeInLinkedList.removeDuplicationUnsortedLinkedList(inputLinkedList);
		// Then

		Assertions.assertThat(expectedLinkenList).isEqualTo(actualLinkedList);
	}

	@Test
	public void testRemoveDuplicationUnsortedLinkedListWithHashMap() throws Exception {
		// Given
		// When
		LinkedList actualLinkedList = this.deteleNodeInLinkedList.removeDuplicationUnsortedLinkedListWithHashMap(inputLinkedList);
		// Then
		Assertions.assertThat(expectedLinkenList).isEqualTo(actualLinkedList);
	}
}