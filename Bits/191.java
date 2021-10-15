//Count One's Hamming Weight

Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
    
public class Solution {
    public int hammingWeight(int n) {
       int count=0;
        
       while(n!=0)
       {
           count++;
           n=n&(n-1);
       }
        
       return count;
      
    }
}

The run time depends on the number of 11-bits in nn. In the worst case, all bits in nn are 11-bits. In case of a 32-bit integer, the run time is O(1)O(1).

The space complexity is O(1)O(1), since no additional space is allocated.
