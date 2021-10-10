Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
    
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
    int ans=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        order(root,low,high);
        return ans;
        
    }
    
    public void order(TreeNode root,int l,int h)
    {
        if(root!=null)
        {
            if(root.val <= h && l <= root.val)
            {
                ans=ans+root.val;
            }
            
            if(l<root.val)
            {
              order(root.left,l,h);  
            }
            
             if(h>root.val)
            {
              order(root.right,l,h); 
            }
        }
    }
    //Simple order and then just adding the values
}
