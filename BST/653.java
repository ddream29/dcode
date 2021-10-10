Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        
       List<Integer>data = new ArrayList<>();
       order(root,data);
        
       int start=0;
       int end=data.size()-1;
        
       while(start<end)
       {
           int sum=data.get(start)+data.get(end);
           
           if(sum==k)
           {
               return true;
           }
           
           if(sum<k)
           {
               start++;
           }
           else
           {
              end--; 
           }
               
       }
        
       return false;
       
    }
    
    //Inorder and add them in list
    //Just do two pointer method
    
    public void order(TreeNode root,List<Integer>data)
    {
        if(root==null)
        {
            return;
        }
        
        order(root.left,data);
        data.add(root.val);
        order(root.right,data);
    }
}
