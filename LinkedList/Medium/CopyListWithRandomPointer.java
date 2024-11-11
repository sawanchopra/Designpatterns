package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        int[] arr = {7, 13, 11, 10, 1};
        ListNode head = ListNode.createLinkedList(arr);
        head.random = null;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.random = head;
        ListNode newHead = copyRandomList(head);
        ListNode.printLinkedList(newHead);
    }

    private static ListNode copyRandomList(ListNode head) {
        Map <ListNode,ListNode> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            map.put(temp,new ListNode(temp.val));
            temp = temp.next;

        }
        temp =head;
        while(temp != null){
          map.get(temp).next  =map.get(temp.next);
           map.get(temp).random= map.get(temp.random);
            temp = temp.next;

        }
        return map.get(head);
    }


}
