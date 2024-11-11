package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

public class PartitionList {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 5, 2};
        ListNode head = ListNode.createLinkedList(arr);
        ListNode newHead = partition(head, 3);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode partition(ListNode head, int i) {
        if(head == null){
            return null;
        }
        ListNode dummy1 = new ListNode(-1);
                ListNode dummy2= new ListNode(-1);
        ListNode current1 = dummy1;
                ListNode current2 = dummy2;
                while(head!=null){
                    if(head.val<i){
                        current1.next = head;
                        current1 = current1.next;

                    }else{
                        current2.next = head;
                        current2 = current2.next;
                    }
                    head = head.next;

                }
                current2.next = null;
                current1.next = dummy2.next;
                return dummy1.next;


    }


}
