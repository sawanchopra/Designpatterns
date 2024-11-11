package LeetCode.BinaryTree.Easy;

import LeetCode.BinaryTree.TreeNode;

public class leafSimilarTrees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        System.out.println(leafSimilar(root1, root2));
    }

    private static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        dfs(root1, sb1);
        dfs(root2, sb2);
        return sb1.toString().equals(sb2.toString());

    }

    private static void dfs(TreeNode root, StringBuilder sb) {
        if(root == null) return;
        if(root.left == null && root.right == null){
            sb.append(root.val).append(",");

        }
        dfs(root.left, sb);
        dfs(root.right, sb);

    }
}
