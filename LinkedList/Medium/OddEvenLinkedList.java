package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createLinkedList(arr);
        ListNode newHead = oddEvenList(head);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode oddEvenList(ListNode head) {
     if(head == null){
         return null;

     }
        ListNode odd = head;
        ListNode even = odd.next;
        ListNode evenHead = even;
     while(even != null && even.next != null){
         odd.next = even.next;
         odd = odd.next;
         even.next = odd.next;
         even = even.next;

     }
        odd.next = evenHead;
        return head;
    }


}
