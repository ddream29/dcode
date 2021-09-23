/*

167. Two Sum II - Input array is sorted

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= first < second <= numbers.length.

Return the indices of the two numbers, index1 and index2, as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

*/
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
     //Already array is sorted so just check if sum > target then number will be on left so decrease left and vice versa
     int i=0;
     int j=numbers.length-1;
        
     while(i<j)
     {
         int sum = numbers[i]+numbers[j];
         if(sum==target)
         {
             return new int[]{i+1,j+1};
         }
         if(sum > target)
         {
             j--;
         }
         else
         {
             i++;
         }
     }
        
        return new int[]{-1,-1};
        
    }
}

//TC 0(n)
//SC 0(1)
