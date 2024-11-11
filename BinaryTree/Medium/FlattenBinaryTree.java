package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

public class FlattenBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        flatten(root);
        while(root != null){
            System.out.println(root.val);
            root = root.right;
        }
    }

    private static void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        while(root.right!=null){
            root = root.right;
        }
        root.right = temp;
    }
}
