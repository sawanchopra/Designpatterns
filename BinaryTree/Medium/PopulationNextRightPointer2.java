package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulationNextRightPointer2 {
    public static void main(String[] args) {
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);

         System.out.println(LevelOrder(root));

    }

    private static Node LevelOrder(Node root) {
        if(root == null) return null;

        Queue<Node> q= new LinkedList<>();
        q.offer(root); // starting with 0 level

        while(!q.isEmpty()){ // bfs traversal
            int size= q.size();
            Node prev= null;
            for(int i=0; i< size; i++){ // level by level point the links as per requirement
                Node curr= q.poll();
                if(prev != null){ // linking nodes
                    prev.next= curr;
                }

                prev= curr; // moving prev to curr

                if(curr.left != null){ // adding left node in queue
                    q.offer(curr.left);
                }

                if(curr.right != null){ // adding right node in queue
                    q.offer(curr.right);
                }
            }
        }
        return root;
    }
}
