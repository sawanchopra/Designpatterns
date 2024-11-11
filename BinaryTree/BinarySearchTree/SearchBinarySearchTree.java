package LeetCode.BinaryTree.BinarySearchTree;

import LeetCode.BinaryTree.TreeNode;

public class SearchBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(searchBST(root,2).val);

    }

    private static TreeNode searchBST(TreeNode root, int i) {
     if(root == null || root.val == i){
         return root;

     }
     if (i<root.val){
         return searchBST(root.left,i);
     }else{
            return searchBST(root.right,i);
     }
    }
}
