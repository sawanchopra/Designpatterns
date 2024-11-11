package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

public class DeleteMiddleNodeOfList {
    public static void main(String[] args) {
        int[] arr = {1};
        ListNode head = ListNode.createLinkedList(arr);
        deleteNode(head);
        ListNode.printLinkedList(head);
    }

    private static ListNode deleteNode(ListNode head) {
       if(head.next == null){
           return null;
       }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return head;

        }



}
