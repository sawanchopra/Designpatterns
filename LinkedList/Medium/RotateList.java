package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

import static LeetCode.LinkedList.ListNode.printLinkedList;

public class RotateList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNode.createLinkedList(arr);
        ListNode newHead = rotateRight(head, 2);
        printLinkedList(newHead);
    }

    private static ListNode rotateRight(ListNode head, int i) {
        if(head == null){
            return null;

        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int length = 0;
        while(fast.next!=null){
            length++;
            fast = fast.next;
        }
        for(int j = length- i%length;j>0;j--){
            slow = slow.next;
        }
        fast.next = dummy.next;
        dummy.next = slow.next;
        slow.next = null;
        return dummy.next;



    }
}
