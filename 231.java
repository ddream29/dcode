//Power of Two 

class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n==0)
        {
            return false;
        }
        else
        {   long x = (long) n;
            return((x & (x - 1)) == 0);
        }
    }
}
