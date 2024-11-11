package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

public class ConstructBinaryTreeFromPreOrderandInorder {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println(root);
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        // Start the recursive helper function to build the tree
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }

    private static TreeNode helper(int preorderIndex, int inorderStart, int inorderEnd, int[] preorder, int[] inorder) {
        // Base case: If the indices are out of bounds, return null (no node)
        if (preorderIndex > preorder.length - 1 || inorderStart > inorderEnd) {
            return null;
        }
        // The current root value is the first element in the preorder traversal
        TreeNode root = new TreeNode(preorder[preorderIndex]);

        // Find the index of the root in the inorder array
        int inordermidIndex = 0;
        for (int j = inorderStart; j <= inorderEnd; j++) {
            if (inorder[j] == root.val) {
                inordermidIndex = j;
                break; // Break once we find the index
            }
        }
        // Recursively build the left subtree
        root.left = helper(preorderIndex + 1, inorderStart, inordermidIndex - 1, preorder, inorder);

        // Recursively build the right subtree
        root.right = helper(preorderIndex + inordermidIndex - inorderStart + 1, inordermidIndex + 1, inorderEnd, preorder, inorder);

        return root; // Return the constructed tree node
    }


}
