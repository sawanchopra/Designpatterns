package LeetCode.LinkedList.Easy;

import LeetCode.LinkedList.ListNode;

public class AddNode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ListNode head = ListNode.createLinkedList(arr);
        ListNode.printLinkedList(head);
        ListNode newHead = addNode(head, 5);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode addNode(ListNode head, int i) {
        //ListNode node = new ListNode(i);
        //node.next = head;
        //return node;

        ListNode node = new ListNode(i);
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = node;
        return head;

        }

}
