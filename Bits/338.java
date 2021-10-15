Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
  
 Solution One
  
  Number of One's if a number is even = binary represenation of number/2 else binary represenation of number/2+1
  
 let's take 4 100  4/2 = 2   Binary Representation -> of two 10 -> one
 let's take 7 111  7/2 = 3   Binary Represenation  -> of three 11 + 1 -> two + 1 = 3
  
 class Solution {
    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];
        
        for(int i=1;i<=n;i++)
        {
            ans[i]=i%2==0? ans[i/2] :ans[i/2]+1;
        }
        
        return ans;        
        
    }
}


Solution Two Main Dp 

Last set bit is the rightmost set bit. Setting that bit to zero with the bit trick, x &= x - 1, leads to the following transition function:

P(x) = P(x \mathrel{\&} (x - 1)) + 1P(x)=P(x&(x−1))+1
  
class Solution {
    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];
        
        for(int i=1;i<=n;i++)
        {
            ans[i]=ans[i&(i-1)]+1;
        }
        
        return ans;        
        
    }
}

Time complexity: O(n). For each integer xx, in the range 11 to nn, we need to perform a constant number of operations which does not depend on the number of bits in xx.

Space complexity: O(1). Since the output array does not count towards the space complexity.

  

