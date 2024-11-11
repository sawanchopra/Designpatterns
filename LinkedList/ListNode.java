package LeetCode.LinkedList;

public class ListNode {
    public int val;
    public ListNode next;
     public ListNode random;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode createLinkedList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(arr);
        ListNode.addFirst(head, 0);
        printLinkedList(head);
    }

    private static void addFirst(ListNode head, int i) {
    }

}
