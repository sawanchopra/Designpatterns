package LeetCode.BinaryTree.BFS.Medium;

import LeetCode.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarytreeRightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(rightSideView(root));

    }

    private static List<Integer> rightSideView(TreeNode root) {
       return rightSideView(root, new ArrayList<>(), 0);

    }

    private static List<Integer> rightSideView(TreeNode root, List<Integer> result, int level) {
        if(root == null){
            return result;
        }
        if(level == result.size()){
            result.add(root.val);
        }

        rightSideView(root.right,result,level+1);
        rightSideView(root.left,result,level+1);

        return result;
    }
}
