package LeetCode.BinaryTree.BinarySearchTree;

import LeetCode.BinaryTree.TreeNode;

public class ReturnKthSmallestElementinBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(kthSmallest(root,1));
        
    }

    private static int kthSmallest(TreeNode root, int i) {
        int[] nums = new int[2];
        inorder(root,nums,i);
        return nums[1];
    }

    private static void inorder(TreeNode root, int[] nums, int i) {
        if(root == null){
            return;
        }
        inorder(root.left,nums,i);
        if(++nums[0] == i){
            nums[1] = root.val;
            return;
        }
        inorder(root.right,nums,i);
    }
}
