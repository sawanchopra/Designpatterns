package LeetCode.BinaryTree.BinarySearchTree;

import LeetCode.BinaryTree.TreeNode;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(3);
        System.out.println(getMinimumDifference(root));
        
    }
    public static int min = Integer.MAX_VALUE;
    public static TreeNode prev = null;
    public static int getMinimumDifference(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 0;
        inOrder(root);
        return min;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) return;
        if (root.left != null) inOrder(root.left);
        if (prev != null) min = Math.min(min, Math.abs(root.val - prev.val));
        prev = root;
        if (root.right != null) inOrder(root.right);
    }


}
