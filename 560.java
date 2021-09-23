/*
560. Subarray Sum Equals
Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        
     // Looping through each element and for each element getting the sum till the point reaches the target and updating value.
     int count=0;
     
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
               sum=sum+nums[j];
                if(sum==k)
                {
                  count++;
                }
            }
        }
        
        return count;
    }
}

//T.C 0{n^2)
//S.C 0(1)

