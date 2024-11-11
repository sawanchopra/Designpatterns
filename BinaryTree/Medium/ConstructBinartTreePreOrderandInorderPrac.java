package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

public class ConstructBinartTreePreOrderandInorderPrac {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(preorder, inorder);
        System.out.println(root.val);
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0,0,inorder.length-1,preorder,inorder);
    }

    private static TreeNode helper(int preorderIndex, int inorderStart, int inorderEnd, int[] preorder, int[] inorder) {
        if(inorderStart>inorderEnd || preorderIndex>preorder.length-1){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorderIndex]);
        int inorderMidIndex = 0;
        for(int i=inorderStart;i<=inorderEnd;i++){
            if(inorder[i] == preorder[preorderIndex]){
                inorderMidIndex = i;
                break;
            }

        }
         root.left = helper(preorderIndex+1,inorderStart,inorderMidIndex-1,preorder,inorder);
        root.right =helper( preorderIndex+inorderMidIndex-inorderStart+1,inorderMidIndex+1,inorderEnd,preorder,inorder);


        return root;
    }
}
