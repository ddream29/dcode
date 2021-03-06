Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

    class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<1)
        {
            return false;
        }
        
        while(n%3==0)
        {
            n=n/3;
        }
        
        return n==1;
        
    }
}

Time complexity : 9(log3n) The number of divisions is given by that logarithm.

Space complexity : O(1). We are not using any additional memory.
