package LeetCode.LinkedList.Easy;

import LeetCode.LinkedList.ListNode;

public class ReverseALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next = second;
        second.next = third;
        third.next = null;
        ListNode newHead = reverseList(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }

    private static ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode current = head;
      while(current!= null){
          ListNode next = current.next;
          current.next = prev;
          prev = current;
          current = next;

      }
      return prev;

    }

}
