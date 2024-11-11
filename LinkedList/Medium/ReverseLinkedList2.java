package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        int[] arr = {3,5};
        ListNode head = ListNode.createLinkedList(arr);
        ListNode newHead = reverseBetween(head, 1, 2);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 0; i<left-1; i++){
            pre = pre.next;
        }
        ListNode curr = pre.next;
        ListNode next = null;
        for(int i = 0; i<right-left; i++){
            next = curr.next;
            curr.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummy.next;





    }
}
