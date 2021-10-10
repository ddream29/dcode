
Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
  
class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        while(left<right)
        {
            right=right&(right-1);
        }
        
        return left & right;
    }
}

T.C  & S.C O(1)
