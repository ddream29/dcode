/*Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.*/

//https://www.youtube.com/watch?v=1FJDyBSfEbo
  
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

//Mode the one that occurs the maximum times 


class Solution {
    Integer prev=null;
    int count=1;
    int max=0;
    public int[] findMode(TreeNode root) {
        
        List<Integer>data = new ArrayList<>();
        
        traverse(root,data);
        int[] modes = new int[data.size()];
        for(int i=0;i<modes.length;i++)
        {
            modes[i]=data.get(i);
        }
        
        return modes;
    }
    
    public void traverse(TreeNode root,List<Integer>data)
    {
        if(root==null)
        {
            return;
        }
        
        traverse(root.left,data);
       if(prev!=null)
       {
        if(root.val==prev)
        {
            count++;
        }
        else
        {
            count=1;
        }        
       }
        
        if(count>max)
        {
            max=count;
            data.clear();
            data.add(root.val);
            
        }
        else if(count==max)
        {
           data.add(root.val);  
        }
       
                
        prev=root.val;
        
       traverse(root.right,data);        
    }
}

TC O(N)
SC O(1) Without stack recur call else O(N)
//We are doing Inorder Traversal why?? Because Inorder is left middle right and all the elements will be sorted in this manner and we cam easily find duplucates just beside each other if they are present
//Traverse left
//if previous is not null then if prev == curr vale then increment count else keep count to zero
//Check if curr > max then increment the max = curr clear the data and add 
//if curr and max are equal then add this val to data
//store prev val
//traverse right
