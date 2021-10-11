Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

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
    public boolean isBst(TreeNode node,long min,long max) {
     
    if (node == null)
    {
        return true;
    }
    /* False if left is > than node */
    if (node.val <=min || max<=node.val)
    {
        return false;
    }
     
    return isBst(node.left,min,node.val) && isBst(node.right,node.val,max);   
    }
    public boolean isValidBST(TreeNode root) {
       return isBst(root,Long.MIN_VALUE,Long.MAX_VALUE); 
    }
}
