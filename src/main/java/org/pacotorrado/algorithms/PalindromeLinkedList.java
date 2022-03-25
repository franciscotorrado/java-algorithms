package org.pacotorrado.algorithms;

import org.pacotorrado.algorithms.utils.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode fastNode = head;
        ListNode slowNode = head;

        while (fastNode != null) {
            if(fastNode.next == null) break;
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        ListNode currentNode = slowNode;
        ListNode previousNode = null;
        ListNode newNode = null;

        while (currentNode != null) {
            newNode = new ListNode(currentNode.val);
            newNode.next = previousNode;
            previousNode = newNode;
            currentNode = currentNode.next;
        }

        ListNode nodeA = head;
        ListNode nodeB = newNode;

        while (nodeA != null && nodeB != null) {
            if(nodeA.val != nodeB.val) {
                return false;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return true;
    }
}
