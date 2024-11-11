package LeetCode.LinkedList.Easy;

import LeetCode.LinkedList.ListNode;

public class MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        ListNode head1 = ListNode.createLinkedList(arr1);
        ListNode head2 = ListNode.createLinkedList(arr2);
        ListNode newHead = mergeTwoLists(head1, head2);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode mergeTwoLists(ListNode head1, ListNode head2) {
   ListNode dummy = new ListNode(-1);
        ListNode temp =  dummy;
        while(head1 != null && head2!= null){
            if(head1.val<head2.val){
                temp.next = head1;
                head1 = head1.next;

            }else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;

        }
        if(head1!= null){
            temp.next = head1;
        }
        return dummy.next;
    }
}
