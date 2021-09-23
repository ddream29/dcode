//Power of 4

//Power of Two and then when we divide by 3 there should be reminder 1
class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n<1)
        {
            return false;
        }
        else if(n==1)
        {
            return true;
        }
        else
        {
            long x = (long)n;
            return ((x&x-1)==0) && n%3==1;
                
        }
        
    }
}

//TC and SC =0(1) Constant 
