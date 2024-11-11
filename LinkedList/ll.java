package LeetCode.LinkedList;

public class ll {
   static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    private Node addFirst(Node head, int i) {
        Node node = new Node(i);
        if (head == null) {
            head = node;
            return head;
        } else {
            node.next = head;
            head = node;
            return head;
        }


        }


    public static void main(String[] args) {
        ll obj = new ll();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node newNode=obj.addFirst(head,4);
        obj.printLinkedList(newNode);

    }

    private void printLinkedList(Node head) {
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }


}
