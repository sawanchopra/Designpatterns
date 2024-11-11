package LeetCode.BinaryTree.Medium;
import LeetCode.BinaryTree.TreeNode;
public class LongestZigZagPathPractice {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.left.right = new TreeNode(1);
        root.right.left.right.left = new TreeNode(1);
        root.right.left.right.left.right = new TreeNode(1);
        System.out.println(longestZigZag(root));
    }

    private static int longestZigZag(TreeNode root) {
        int[] result = new int[1];
        helper(root, result, true, 0);
        helper(root, result, false, 0);

        return result[0];
    }

    private static void helper(TreeNode root, int[] result, boolean b, int i) {
        if(root == null){
            return;
        }
        result[0] = Math.max(result[0], i);
        if(b){
            helper(root.left,result,false,i+1);
            helper(root.right,result,true,1);

        }else{
            helper(root.right,result,true,i+1);
            helper(root.left,result,false,1);

        }

    }
}
