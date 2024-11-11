package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

public class ConstructBinaryTreeFromPostOrderandInorder {
    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        TreeNode root = buildTree(inorder, postorder);
        System.out.println(root.val);
    }

    private static TreeNode buildTree(int[] inorder, int[] postorder) {
      return helper(0,inorder.length-1,postorder.length-1,inorder,postorder);

    }

    private static TreeNode helper(int inorderStart, int inorderEnd, int postorderIndex, int[] inorder, int[] postorder) {
           if(postorderIndex<0 || inorderStart>inorderEnd){
               return null;
           }
           TreeNode root = new TreeNode(postorder[postorderIndex]);
           int inorderMidIndex = 0;
           for(int i = inorderStart;i<=inorderEnd;i++) {
               if (inorder[i] == postorder[postorderIndex]) {
                   inorderMidIndex = i;
                   break;
               }
           }
              root.left = helper(inorderStart,inorderMidIndex-1,postorderIndex-(inorderEnd-inorderMidIndex)-1,inorder,postorder);
           root.right = helper(inorderMidIndex+1,inorderEnd,postorderIndex-1,inorder,postorder);

               return root;



    }
}
