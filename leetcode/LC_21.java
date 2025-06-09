/* https://leetcode.com/problems/merge-two-sorted-lists/submissions/1657413204/ */

public class LC_21 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = null;
        ListNode current = null;

        while (list1 != null || list2 != null) {

            ListNode selected = null;

            if (list1 == null) {
                selected = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                selected = list1;
                list1 = list1.next;
            } else {
                if (list1.val <= list2.val) {
                    selected = list1;
                    list1 = list1.next;
                } else {
                    selected = list2;
                    list2 = list2.next;
                }
            }

            if (result == null) {
                // 처음 노드 설정
                result = selected;
                current = result;
            } else {
                // 이어 붙이기
                current.next = selected;
                current = current.next;
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
