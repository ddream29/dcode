//Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

class Solution {
    public int longestOnes(int[] nums, int k) {
        
        /*
         Template ONE
         
         At most ->Not more than k 
        
         We are just going to use the Base Template for such problems 
          
         Define the value of k 
             
         Define Start point 
             
         Define End Point 
             
         Point both at 0th position
             
         1 0 0 1 1 0
         
         Start
         End
         
         for each iteration check if given value is zero if yes then decrement the vale of k
             
         if at any point we find that k value is less than 0 that means we have exceded the limt 
         of flips or deletion 
             
         So we need to move the Start pointer to the a place where k is again back to zero
         and increment the vale of the both Start Pointer and K value
             
         Finaly Maximum valuw will be 
             
             
         Max of max till now and length of substring between End and Start Index + 1 beacuse we are finding the lengths
         
         */
        
         int start=0;
         int ans=0;
         
         for(int end=0;end<nums.length;end++)
         {
             if(nums[end]==0)
             {
                 k--;
             }
             
             while(k<0)
             {
                 if(nums[start]==0)
                 {
                     k++;
                 }
                 
                 start++;
             }
             
             ans=Math.max(ans,end-start+1);
         }
            
        return ans;        
        
    }
}
