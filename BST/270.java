Given the root of a binary search tree and a target value, return the value in the BST that is closest to the target.
  
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
    public int closestValue(TreeNode root, double target) {
    
        int res = root.val;
        
        while(root!=null)
        {
                        
            if(Math.abs(root.val-target) < Math.abs(res-target))
            {
              res=root.val;  
            }
            
            if(target<root.val)
            {
                root=root.left;
            }
            else
            {
                root=root.right;
            }
        }

      return res;
    }
}

/*
  4
3   6
      
Keep the difference at root

If root.val-target < res-target
  
update the difference value

*/
