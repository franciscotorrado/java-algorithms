package org.pacotorrado.algorithms;

import org.junit.jupiter.api.Test;
import org.pacotorrado.algorithms.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedListTest {
    MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    void returnCorrectHalfForOddNumberOf4Nodes() {
        ListNode nodeC = new ListNode(4);
        ListNode nodeB = new ListNode(3, nodeC);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertEquals(middleOfTheLinkedList.middleNode(head), nodeB);
    }

    @Test
    void returnCorrectHalfForOddNumberOf6Nodes() {
        ListNode nodeE = new ListNode(6);
        ListNode nodeD = new ListNode(5, nodeE);
        ListNode nodeC = new ListNode(4, nodeD);
        ListNode nodeB = new ListNode(3, nodeC);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertEquals(middleOfTheLinkedList.middleNode(head), nodeC);
    }

    @Test
    void returnCorrectHalfForEvenNumberOf5Nodes() {
        ListNode nodeD = new ListNode(5);
        ListNode nodeC = new ListNode(4, nodeD);
        ListNode nodeB = new ListNode(3, nodeC);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertEquals(middleOfTheLinkedList.middleNode(head), nodeB);
    }

    @Test
    void returnCorrectHalfForEvenNumberOf3Nodes() {
        ListNode nodeB = new ListNode(3);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertEquals(middleOfTheLinkedList.middleNode(head), nodeA);
    }
}
