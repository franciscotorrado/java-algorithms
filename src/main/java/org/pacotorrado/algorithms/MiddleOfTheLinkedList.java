package org.pacotorrado.algorithms;

import org.pacotorrado.algorithms.utils.ListNode;

public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode != null) {
            if(fastNode.next == null) break;
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        return slowNode;
    }
}
