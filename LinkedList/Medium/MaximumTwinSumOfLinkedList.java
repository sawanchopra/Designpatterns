package LeetCode.LinkedList.Medium;

import LeetCode.LinkedList.ListNode;

public class MaximumTwinSumOfLinkedList {
    public static void main(String[] args) {
        int[] arr = {5,4,2,1};
        ListNode head = ListNode.createLinkedList(arr);
        System.out.println(maxTwinSum(head));
    }

    private static int maxTwinSum(ListNode head) {
        int result  =0;
        if(head == null){
       return result;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        while(slow!= null){
            result = Math.max(slow.val + prev.val,result);
            slow = slow.next;
            prev = prev.next;

        }

        return result;



    }
}
