Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.

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
    //Same do Inorder as it will be sorted and then difference of prev and curr eleemnt 
    Integer prev,ans;
    
    public int minDiffInBST(TreeNode root) {
        prev=null;
        ans=Integer.MAX_VALUE;
        order(root);
        return ans;
    }
    
    public void order(TreeNode root)
    {   if(root==null)
        {
        return;
        }
        order(root.left);
        if(prev!=null)
        {  
        ans=Math.min(ans,root.val-prev);
        }
        prev=root.val;
        order(root.right);
    }
}
