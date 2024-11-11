package LeetCode.BinaryTree.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class PopulationNextRightPointer2Practice {
    public static void main(String[] args) {
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);

         System.out.println(LevelOrder(root));

    }

    private static Node LevelOrder(Node root) {
        if(root == null){
            return null;

        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            Node prev = null;
            for(int i =0;i<size;i++){
                Node curr = queue.poll();
                if(prev!= null){
                    prev.next = curr;
                }
                prev = curr;
                if(curr.left != null){
                    queue.offer(curr.left);

                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
        }
        return root;

    }
}
