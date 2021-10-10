Given the root of a binary search tree and a node p in it, return the in-order successor of that node in the BST. If the given node has no in-order successor in the tree, return null.

The successor of a node p is the node with the smallest key greater than p.val.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        
        TreeNode prev = null;
        
        while(root!=null)
        {
            if(p.val >= root.val)
            {
                root=root.right;
            }
            else
            {
                prev = root;
                root=root.left;
            }
        }
        
        return prev;
        
    }
}
