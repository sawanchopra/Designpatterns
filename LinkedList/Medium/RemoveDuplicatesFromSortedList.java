package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3,4,4,5};
        ListNode head = ListNode.createLinkedList(arr);
        ListNode newHead = removeDuplicatedFromSortedList(head);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode removeDuplicatedFromSortedList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        while(head !=null){
            if(head.next!= null && head.val == head.next.val){
                while(head.next!= null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;

            }else{
                prev = prev.next;
            }





            head = head.next;

        }





        return  dummy.next;


    }
}
