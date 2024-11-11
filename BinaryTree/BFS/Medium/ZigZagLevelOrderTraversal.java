package LeetCode.BinaryTree.BFS.Medium;

import LeetCode.BinaryTree.TreeNode;

import java.util.List;

public class
ZigZagLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        zigzagLevelOrder(root);
    }

    private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new java.util.ArrayList<>();
        if(root == null){
            return result;
        }
        zigzagLevelOrder(root,result,0);
        return result;

    }

    private static void zigzagLevelOrder(TreeNode root, List<List<Integer>> result, int i) {
        if(root == null){
            return;
        }
        if(result.size() <= i){
            result.add(new java.util.ArrayList<>());
        }
        if(i%2 == 0){
            result.get(i).add(root.val);
        }
        else {
            result.get(i).add(0,root.val);
        }
        zigzagLevelOrder(root.left,result,i+1);
        zigzagLevelOrder(root.right,result,i+1);


    }
}
