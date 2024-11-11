package LeetCode.BinaryTree.Easy;

import LeetCode.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CreateBinaryTreeComplete {
    public static void main(String[] args) {
        int[] preOrder = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeNode root = createBinaryTree(preOrder);
        System.out.println(root.val);
        System.out.println("PreOrder");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder");
        postOrder(root);
        System.out.println();
        System.out.println("LevelOrder");
        levelOrder(root);
        System.out.println("Count of Nodes");
        System.out.println(countNodes(root));
        System.out.println("Sum of Nodes");
        System.out.println(sumOfNodes(root));
        System.out.println("Height of Tree");
        System.out.println(heightOfTree(root));
        System.out.println("Diameter of Tree");
        System.out.println(diameterOfTree(root));
        System.out.println("Diameter of Tree withN");
        System.out.println(diameterOfTreeN(root).diameter);



    }
    static class TreeInfo{
        int diameter;
        int height;
        public TreeInfo(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    private static TreeInfo diameterOfTreeN(TreeNode root) {
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo leftTree = diameterOfTreeN(root.left);
        TreeInfo rightTree = diameterOfTreeN(root.right);
        int height = Math.max(leftTree.height, rightTree.height)+1;
        int diameter = Math.max(leftTree.height+rightTree.height+1, Math.max(leftTree.diameter, rightTree.diameter));
        return new TreeInfo(diameter, height);
    }

    private static int diameterOfTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftD = diameterOfTree(root.left);
        int rightD = diameterOfTree(root.right);
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        return Math.max(leftHeight+rightHeight+1, Math.max(leftD, rightD));

    }

    private static int heightOfTree(TreeNode root) {
      if(root == null){
            return 0;

      }
      int leftHeight = heightOfTree(root.left);
      int rightHeight = heightOfTree(root.right);
      return Math.max(leftHeight, rightHeight)+1;
    }

    private static int sumOfNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
       return leftSum+rightSum+root.val;
    }

    private static int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftNode = countNodes(root.left);
        int rightNode = countNodes(root.right);
        return leftNode+rightNode+1;
    }


    private static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode currNode = queue.remove();
            if(currNode == null){
                System.out.println();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }
            else{
                System.out.print(currNode.val+" ");
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
        }
    }

    private static void levelOrder1(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode currNode = queue.remove();
            if(currNode == null){
                System.out.println();
                if(!queue.isEmpty()){
                    queue.add(null);
                }

            }else{
                System.out.println(currNode.val+" ");
                if(currNode.left!= null){
                    queue.add(currNode.left);
                }
                if (currNode.right!= null) {
                    queue.add(currNode.right);
                }

            }


        }

    }

    private static void postOrder(TreeNode root) {
        if(root == null){
            System.out.print(-1+" ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    private static void inOrder(TreeNode root) {
        if(root == null ){
            System.out.print(-1+" ");
            return;
        }
        preOrder(root.left);
        System.out.print(root.val+" ");
        preOrder(root.right);
    }


    private static void preOrder(TreeNode root) {
        if(root == null ){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static int index =-1;

    private static TreeNode createBinaryTree(int[] preOrder) {
        index++;
        if(preOrder[index] == -1){
            return null;
        }
        TreeNode root = new TreeNode(preOrder[index]);
        root.left  = createBinaryTree(preOrder);
        root.right = createBinaryTree(preOrder);
        return root;
    }




}
