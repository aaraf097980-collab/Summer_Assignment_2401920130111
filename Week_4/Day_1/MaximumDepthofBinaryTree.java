package Week_4.Day_1;

import java.util.LinkedList;
import java.util.Queue;



public class MaximumDepthofBinaryTree {
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public int maxDepth(TreeNode root) {
        // If tree is empty, depth is 0
        if(root==null){
            return 0;
        }
           Queue<TreeNode> queue=new LinkedList<>();
           // Insert root node
           queue.add(root);
           int numberoflevels=0;
            while(!queue.isEmpty()){
                numberoflevels++;
              int size=queue.size();
              for (int i=0;i<size;i++){
                TreeNode node=queue.poll();
                 // Add left child if it exists and Add right child if it exists
                if(node.left!=null) queue.add(node.left);               
                if(node.right!=null) queue.add(node.right);               
                
            }
           }
           // return maximum depth
           return numberoflevels;
    }
    public static void main(String [] args){
       
       TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
         MaximumDepthofBinaryTree obj =new MaximumDepthofBinaryTree();
        System.out.println("Maximum Depth = " + obj.maxDepth(root));
    }
}
