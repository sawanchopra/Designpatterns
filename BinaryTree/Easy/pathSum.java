package LeetCode.BinaryTree.Easy;

import LeetCode.BinaryTree.TreeNode;

public class pathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(root, 22));
    }

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return  false;
        }
        if(root.left == null && root.right== null && targetSum-root.val == 0){
            return true;
        }
     return hasPathSum(root.left,targetSum-root.val)
             || hasPathSum(root.right,targetSum-root.val);

    }
}
