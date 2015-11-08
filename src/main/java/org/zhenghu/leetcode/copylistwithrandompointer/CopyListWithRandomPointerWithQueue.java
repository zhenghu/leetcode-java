package org.zhenghu.leetcode.copylistwithrandompointer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Copy List With Random Pointer Solution
 */
public class CopyListWithRandomPointerWithQueue {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        Map<Integer, RandomListNode> map = new HashMap<>();
        Deque<RandomListNode> queue = new ArrayDeque<>();
        queue.offer(head);
        while (!queue.isEmpty()) {
            RandomListNode current = queue.poll();
            RandomListNode cloned;
            if (map.containsKey(current.label)) {
                cloned = map.get(current.label);
            }
            else {
                cloned = new RandomListNode(current.label);
                map.put(current.label, cloned);
            }
            if (current.next != null) {
                if (map.containsKey(current.next.label)) {
                    cloned.next = map.get(current.next.label);
                }
                else {
                    RandomListNode n = new RandomListNode(current.next.label);
                    map.put(current.next.label, n);
                    cloned.next = n;
                    queue.offer(current.next);
                }
            }
            if (current.random != null) {
                if (map.containsKey(current.random.label)) {
                    cloned.random = map.get(current.random.label);
                }
                else {
                    RandomListNode n = new RandomListNode(current.random.label);
                    map.put(current.random.label, n);
                    cloned.random = n;
                    queue.offer(current.random);
                }
            }
        }
        return map.get(head.label);
    }

}


