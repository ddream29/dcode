//Longest Subarray of 1's After Deleting One Element

class Solution {
    public int longestSubarray(int[] nums) {
        
        /* Same Template One just because we are deleting an element do it's j-i else j-i+1*/
        
        int k=1;
        int i=0;
        int max=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            {
                k--;
            }
            
            while(k<0)
            {
                if(nums[i]==0)
                {
                    k++;
                }
                
                i++;
            }
            
            max=Math.max(max,j-i);
        }
        
        return max;
    }
}
