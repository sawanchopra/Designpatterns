package LeetCode.BinaryTree.Easy;

import LeetCode.BinaryTree.TreeNode;

public class CreateBinaryTreeUsingInorder {
    public static void main(String[] args) {
        int[] inOrder = {4,2,5,1,6,3};
       
        TreeNode root = createBinaryTree(inOrder);
        System.out.println(root.val);
        //inOrder(root);
    }
   static int index = -1;
    private static TreeNode createBinaryTree(int[] inOrder) {
        index ++;
        if(inOrder[index] == -1){
            return null;
        }
        TreeNode root = new TreeNode(inOrder[index]);
        root.left = createBinaryTree(inOrder);
        root.right = createBinaryTree(inOrder);
        return root;

    }
}
