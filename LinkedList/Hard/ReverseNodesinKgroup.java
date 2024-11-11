package LeetCode.LinkedList.Hard;

import LeetCode.LinkedList.ListNode;

public class ReverseNodesinKgroup {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createLinkedList(arr);
        ListNode newHead = reverseKGroup(head, 2);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode reverseKGroup(ListNode head, int i) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while (end.next != null) {
            for (int j = 0; j < i && end != null; j++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    private static ListNode reverse(ListNode start) {
        ListNode pre = null;
        ListNode curr = start;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
