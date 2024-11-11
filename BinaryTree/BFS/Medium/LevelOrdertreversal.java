package LeetCode.BinaryTree.BFS.Medium;

import LeetCode.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrdertreversal {
    public static void main(String[] args) {
        System.out.println("Level Order Traversal");
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        levelOrderTraversal(root);
    }

    private static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new java.util.ArrayList<>();
        Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        queue.add(null);
        result.add(new ArrayList<>());
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
             if(curr == null){
                 result.add(new ArrayList<>());
                 if(!queue.isEmpty()){
                        queue.offer(null);
                 }

             }
             else {
                 result.get(result.size()-1).add(curr.val);
                 if(curr.left != null){
                     queue.offer(curr.left);
                 }
                 if(curr.right != null){
                     queue.offer(curr.right);
             }
             }
        }
        result.remove(result.size()-1);
        return result;
    }
}
