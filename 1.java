/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer>map = new HashMap<>();
       
        
        for(int i=0;i<nums.length;i++)
        {
            //if a+b=target then target-b=a;
            if(map.containsKey(target-nums[i]))
            {
                return(new int[] {i,map.get(target-nums[i])
                                  });
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        
        return new int[]{-1,-1};
        
    }
}

//TC 0(n)
//SC 0(n)


