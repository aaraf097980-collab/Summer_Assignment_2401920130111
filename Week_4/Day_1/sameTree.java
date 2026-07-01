package Week_4.Day_1;

import java.util.LinkedList;
import java.util.Queue;

public class sameTree {
        static class TreeNode{
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int val){
                this.val=val;
            }
        }
    public boolean isSameTree(TreeNode p, TreeNode q) {
          Queue<TreeNode> queue=new LinkedList<>();
          queue.add(p);
          queue.add(q);

          while(!queue.isEmpty()){
            TreeNode first=queue.poll();
            TreeNode second=queue.poll();
            if(first==null && second== null){
                continue;
            }
            else if(first==null || second==null || first.val !=second.val){
                return false;
            }
            
     queue.add(first.left);
     queue.add(second.left);
     queue.add(first.right);
     queue.add(second.right);
            
          }
          return true;
    }
    public  static void main (String [] args){
        
        sameTree obj = new sameTree();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3); 
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(obj.isSameTree(p, q));
    }
}
