package org.example;

import org.w3c.dom.Node;

import java.util.Stack;

/**
 * @author Levantosina
 */
public class PalindromeLinkedList {


    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        Stack<Integer> stack = new Stack<>();


        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }


        if (fast != null) {
            slow = slow.next;
        }


        while (slow != null) {
            int top = stack.pop();

            if (top != slow.val) {
                return false;
            }

            slow = slow.next;
        }

        return true;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}


