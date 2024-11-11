package LeetCode.LinkedList.Easy;

import LeetCode.LinkedList.ListNode;

public class LinkedListCycle {
    public static void main(String[] args) {
        int[] arr = {-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5};
        int pos = -1;
        ListNode head = ListNode.createLinkedList(arr);
        ListNode current = head;
        ListNode cycleNode = null;
        while (current.next != null) {
            if (pos == 0) {
                cycleNode = current;
            }
            current = current.next;
            pos--;
        }
        current.next = cycleNode;
        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }
        return false;
    }
}
