package LeetCode.BinaryTree.BFS.Medium;

import LeetCode.BinaryTree.TreeNode;

import java.util.List;
import java.util.Queue;

public class AverageofLevelsOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(averageOfLevels(root));
    }

    private static List<Double> averageOfLevels(TreeNode root) {
        Double sum = 0.0;
        int level = 1;
        List<Double> result = new java.util.ArrayList<>();
        Queue <TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode curr = queue.poll();
                sum+= curr.val;
                if(curr.left!= null){
                    queue.offer(curr.left);
                }
                if(curr.right!= null){
                    queue.offer(curr.right);
                }
            }
            result.add(sum/size);
            sum = 0.0;
            level++;
        }
        return result;
    }
}
