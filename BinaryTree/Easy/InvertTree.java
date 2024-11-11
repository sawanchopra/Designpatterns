package LeetCode.BinaryTree.Easy;

import LeetCode.BinaryTree.TreeNode;

public class InvertTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        printtree(root);
        TreeNode newRoot = invertTree(root);

        printtree(newRoot);
    }

    private static void printtree(TreeNode root) {
        if(root == null){
            return;
        }
        printtree(root.left);
        System.out.print(root.val+" ");
        printtree(root.right);
        System.out.println();
    }

    private static TreeNode invertTree(TreeNode root) {
        if(root == null){ return null;}
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;


    }
}
