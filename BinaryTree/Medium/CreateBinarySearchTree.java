package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

public class CreateBinarySearchTree {
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        TreeNode root = bstFromPreorder(preorder);

    }

    private static TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length-1);

    }

    private static TreeNode helper(int[] preorder, int i, int i1) {
        if(i > i1) return null;
        TreeNode root = new TreeNode(preorder[i]);
        int j = i;
        while(j <= i1 && preorder[j] <= preorder[i]) j++;
        root.left = helper(preorder, i+1, j-1);
        root.right = helper(preorder, j, i1);
        return root;
    }
}
