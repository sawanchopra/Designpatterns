package LeetCode.BinaryTree.BFS.Medium;

import LeetCode.BinaryTree.TreeNode;

import java.util.Queue;

public class MaximumLevelSumOfBinaryTree {
    public static void main(String[] args) {
         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(7);
         root.right = new TreeNode(0);
         root.left.left = new TreeNode(7);
         root.left.right = new TreeNode(-8);
         System.out.println(maxLevelSum(root));
    }

    private static int maxLevelSum(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
        int ans = 0;
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int sum = 0;
            for(int i =0;i<size;i++){
                TreeNode curr = queue.poll();
                sum+= curr.val;
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }


            }
            if(sum>maxSum){
                maxSum = sum;
                ans = level;
            }
            level++;

        }



        return ans;



    }
}
