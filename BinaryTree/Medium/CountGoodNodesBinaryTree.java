package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

public class CountGoodNodesBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        System.out.println(goodNodes(root));
    }

    private static int goodNodes(TreeNode root) {
       return goodNode(root,Integer.MIN_VALUE);
    }

    private static int goodNode(TreeNode root, int minValue) {
        if(root == null){
            return 0;

        }
        int count  =0;
        if(root.val >= minValue){
            count++;
            minValue = root.val;

        }
        count += goodNode(root.left,minValue);
        count += goodNode(root.right,minValue);
        return count;
    }


}
