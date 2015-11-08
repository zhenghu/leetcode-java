package org.zhenghu.leetcode.copylistwithrandompointer;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Copy List With Random Pointer Solution
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<Integer, RandomListNode> map = new HashMap<>();
        RandomListNode node = head, prev = null, cloneHead = null;
        while (node != null) {
            RandomListNode clone;
            if (map.containsKey(node.label)) {
                clone = map.get(node.label);
            } else {
                clone = new RandomListNode(node.label);
                map.put(clone.label, clone);
            }
            RandomListNode rand;
            if (node.random != null) {
                if (map.containsKey(node.random.label)) {
                    rand = map.get(node.random.label);
                } else {
                    rand = new RandomListNode(node.random.label);
                    map.put(rand.label, rand);
                }
                clone.random = rand;
            }
            if (prev != null) {
                prev.next = clone;
            } else {
                cloneHead = clone;
            }
            prev = clone;
            node = node.next;
        }

        return cloneHead;
    }

}


