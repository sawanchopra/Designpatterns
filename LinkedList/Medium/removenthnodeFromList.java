package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

public class removenthnodeFromList {
    public static void main(String[] args) {
        int[] arr = {1};
        ListNode head = ListNode.createLinkedList(arr);
        ListNode newHead = removeNthFromEnd(head, 1);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode removeNthFromEnd(ListNode head, int index) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i = 0; i<=index; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
