//Given a binary array nums, return the maximum number of consecutive 1's in the array.


  class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
       /*
       Template One        
       As soon as you hit zero decrease vale of k 
       
       */
        
       int k=0;
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
