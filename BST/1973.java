1973. Count Nodes Equal to Sum of Descendants

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
    
    int count=0;
    public int equalToDescendants(TreeNode root) {
        sum(root);
        return count;
    }
    
    public int sum(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int left = sum(root.left);
        int right = sum(root.right);
        
        if((left+right)==root.val)
        {
            count++;
        }
        
        return left+right+root.val;
    }
}
