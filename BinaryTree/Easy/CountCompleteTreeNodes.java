package LeetCode.BinaryTree.Easy;

import LeetCode.BinaryTree.TreeNode;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        System.out.println(countNodes(root));
    }

    private static int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left+right+1;
    }
}
