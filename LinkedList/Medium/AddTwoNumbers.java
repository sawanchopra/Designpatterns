package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};
        ListNode head1 = ListNode.createLinkedList(arr1);
        ListNode head2 = ListNode.createLinkedList(arr2);
        ListNode newHead = addTwoNumbers(head1, head2);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode addTwoNumbers(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;
        while(head1 !=null || head2 != null){
            int x = head1!=null?head1.val:0;
            int  y = head2!=null?head2.val:0;
            int sum = x+y+carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            if(head1!=null) head1 = head1.next;
            if(head2!=null) head2 = head2.next;



        }
        if(carry>0){
            temp.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
