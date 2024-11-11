package LeetCode.BinaryTree.Medium;


import LeetCode.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
    List<Integer> list = new ArrayList<>();
    int index = 0;


    public BSTIterator(TreeNode root) {
        inorder(root);

    }

    private void inorder(TreeNode root) {
        if(root != null){
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
    }

    public int next() {
        return list.get(index++);

    }

    public boolean hasNext() {
        return index<list.size();
    }












    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);
        BSTIterator bstIterator = new BSTIterator(root);
       System.out.println(bstIterator.hasNext());
        System.out.println(bstIterator.next());
    }

}
