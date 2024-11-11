package LeetCode.BinaryTree.BinarySearchTree;

import LeetCode.BinaryTree.TreeNode;

public class DeleteNodeInBst {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        System.out.println(deleteNode(root,3).val);
        

    }

    private static TreeNode deleteNode(TreeNode root, int i) {
        if(root == null){
            return null;
        }
        if(i<root.val){
            root.left = deleteNode(root.left,i);
        }else if(i>root.val){
            root.right = deleteNode(root.right,i);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right,minNode.val);
        }
        return root;

    }

    private static TreeNode findMin(TreeNode right) {
        while(right.left!=null){
            right = right.left;
        }
        return right;
    }
}
