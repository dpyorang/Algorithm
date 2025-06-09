/* https://leetcode.com/problems/palindrome-linked-list/submissions/1657372930/ */

import java.util.Deque;
import java.util.LinkedList;

public class LC_234 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        boolean result = true;

        Deque<Integer> deque = new LinkedList<>();

        while (head != null) {
            deque.push(head.val);
            head = head.next;
        }

        while (!deque.isEmpty() && deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                result = false;
            }
        }

        return result;
    }



    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
