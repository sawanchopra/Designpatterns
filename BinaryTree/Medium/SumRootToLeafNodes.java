package LeetCode.BinaryTree.Medium;

import LeetCode.BinaryTree.TreeNode;

public class SumRootToLeafNodes {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(sumNumbers(root));

    }

    private static int sumNumbers(TreeNode root) {
        int i =0;
        return sumLeafNumbers(root,i);

    }

    private static int sumLeafNumbers(TreeNode root, int i) {
        if(root == null){
            return 0;
        }
        i = i*10+root.val;
        if(root.right == null && root.left == null){
            return i;

        }
        return sumLeafNumbers(root.left,i)+sumLeafNumbers(root.right,i);
    }


}
