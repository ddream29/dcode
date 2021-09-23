/*
1679. Max Number of K-Sum Pairs( 2 Values)
Share
You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.
*/
//Sorting it here so that we will def know the value of sum as compared to target 

//Another variation of Sum Subarray

class Solution {
    public int maxOperations(int[] nums, int k) {
        int start=0;
        int end=nums.length-1;
        int count=0;
        
        Arrays.sort(nums);
        
        while(start < end)
        {
            if(nums[start]+nums[end]>k)
            {
                end--;
            }
            else if(nums[start]+nums[end]<k)
            {
                start++;
            }
            else
            {
                start++;
                count++;
                end--;
                
            }
        }
        return count;
    }
}

//TC 0(NlogN) Sorting+ Traversing
//SC 0(logN)  Sorting+Traversing
