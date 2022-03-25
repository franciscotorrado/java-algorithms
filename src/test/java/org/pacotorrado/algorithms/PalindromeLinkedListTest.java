package org.pacotorrado.algorithms;

import org.junit.jupiter.api.Test;
import org.pacotorrado.algorithms.utils.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTest {
    PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    void checkThat_1_IsPalindrome() {
        ListNode head = new ListNode(1);

        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void checkThat_11_IsPalindrome() {
        ListNode nodeA = new ListNode(1);
        ListNode head = new ListNode(1, nodeA);

        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void checkThat_12_IsNotPalindrome() {
        ListNode nodeA = new ListNode(2);
        ListNode head = new ListNode(1, nodeA);

        assertFalse(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void checkThat_1221_IsPalindrome() {
        ListNode nodeC = new ListNode(1);
        ListNode nodeB = new ListNode(2, nodeC);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void checkThat_101_IsPalindrome() {
        ListNode nodeB = new ListNode(1);
        ListNode nodeA = new ListNode(0, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void checkThat_125521_IsPalindrome() {
        ListNode nodeE = new ListNode(1);
        ListNode nodeD = new ListNode(2, nodeE);
        ListNode nodeC = new ListNode(5, nodeD);
        ListNode nodeB = new ListNode(5, nodeC);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void checkThat_12521_IsPalindrome() {
        ListNode nodeD = new ListNode(1);
        ListNode nodeC = new ListNode(2, nodeD);
        ListNode nodeB = new ListNode(5, nodeC);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertTrue(palindromeLinkedList.isPalindrome(head));
    }

    @Test
    void checkThat_12551_IsPalindrome() {
        ListNode nodeD = new ListNode(1);
        ListNode nodeC = new ListNode(5, nodeD);
        ListNode nodeB = new ListNode(5, nodeC);
        ListNode nodeA = new ListNode(2, nodeB);
        ListNode head = new ListNode(1, nodeA);

        assertFalse(palindromeLinkedList.isPalindrome(head));
    }
}

