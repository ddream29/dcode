/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
*/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
       /* At most there can be only 2 elements having length n/3 in a array
            
            We will find the first 2 elements 
            
       Track the count of occurences of candidates*/
            
       int count1=0;
       int count2=0;
        
       Integer one = null;
       Integer two = null;
          
       for(int n:nums)
       {
           if(one !=null && one==n)
           {
             count1++;
           }
           else if(two!=null && two==n)
           {
               count2++;
           }
           else if(count1==0)
           {
             one=n;
             count1++;
           }
           else if(count2==0)
           {
               two=n;
               count2++;
           }
           else
           {
               count1--;
               count2--;
           }
       }
        
        
     List<Integer>data = new ArrayList<>();
        
     count1=0;
     count2=0;
        
        
     for(int i:nums)
     {
         if(one!=null && i==one)
         {
             count1++;
         }
         
         if(two!=null && i==two)
         {
             count2++;
         }
        
     }
        
     int n = nums.length;
     
     if(count1>n/3)
     {
         data.add(one);
     }
        
     if(count2>n/3)
     {
         data.add(two);
     }
       
      return data;
        
        
    }
}
