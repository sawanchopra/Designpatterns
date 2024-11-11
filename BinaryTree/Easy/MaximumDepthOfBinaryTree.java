package LeetCode.BinaryTree.Easy;

import LeetCode.BinaryTree.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(11);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(TreeNode root) {
 if(root == null){
return 0;
 }
 int left = maxDepth(root.left);
 int right = maxDepth(root.right);
    return Math.max(left,right)+1;


    }
}