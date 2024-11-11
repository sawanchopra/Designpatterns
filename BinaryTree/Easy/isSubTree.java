package LeetCode.BinaryTree.Easy;

import LeetCode.BinaryTree.TreeNode;

public class isSubTree {
    public static void main(String[] args) {
        TreeNode s = new TreeNode(3);
        s.left = new TreeNode(4);
        s.right = new TreeNode(5);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(2);
        s.left.right.left = new TreeNode(0);

        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);

        System.out.println(isSubtree(s, t));
    }

    private static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null) return false;
        if(isSame(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);

    }

    private static boolean isSame(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.val != t.val) return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }

}
