package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        System.out.println(lowestCommonAncestor(root, root.left, root.right));
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode left, TreeNode right) {
if(root == null || root == left || root == right){
    return root;
}
        TreeNode leftNode =lowestCommonAncestor(root.left,left,right);
        TreeNode rightNode =lowestCommonAncestor(root.right,left,right);
        if(leftNode!=null && rightNode!=null){
            return root;

        }
        return leftNode!=null?leftNode:rightNode;
    }
}
