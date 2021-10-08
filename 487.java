//Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        /*
        Template One 
        
        This also follows the same pattern where we need to delete or flip characters or max times a character appears
            
         Here k=1
         */
        
        int k=1;
        
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
            
            ans= Math.max(ans,end-start+1);
        }
        
        return ans;         
        
    }
}

 
