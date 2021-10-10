Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.
    
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
    public TreeNode increasingBST(TreeNode root) {
      
        List<Integer>data=new ArrayList<>();
        inorder(root,data);
        
        //Create Sentinal Node
        
        TreeNode one = new TreeNode(0);
        TreeNode curr=one;
        for(int v:data)
        {
           curr.right= new TreeNode(v);
           curr=curr.right;
        }
          
    
     return one.right;
        
    }
    //Do simple in order traversal 
    public void inorder(TreeNode root,List<Integer>data)
    {
        if(root==null)
        {
            return;
        }
        
        inorder(root.left,data);
        data.add(root.val);
        inorder(root.right,data);
    }
}
