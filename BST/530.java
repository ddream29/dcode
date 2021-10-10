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

Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
    
class Solution {
    int prev = Integer.MAX_VALUE;
    int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        
        traversal(root);
        return ans;
    }
    
    public void traversal(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        
        traversal(root.left);
        ans=Math.min(ans,Math.abs(root.val-prev));
        prev=root.val;
        traversal(root.right);
    }
    
    /*
    Doing inorder traversal as inorder will be in sorted and ascending order
    storing the previous node and then calculating the difference of root val and prev and       updating ans accordingly
    */
}
