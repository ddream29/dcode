Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.

A boomerang is a set of three points that are all distinct and not in a straight line.

class Solution {
    public boolean isBoomerang(int[][] points) {
        
      if((points[1][1]-points[0][1])*(points[2][0]-points[1][0])==(points[2][1]-points[1][1])*(points[1][0]-points[0][0])) return false;
        return true;
    }
}
/*
11 22 33 
|  |   |
00 11 22
01 01 01
*/

x2-x1   = x2 - x1
.....     .......
y2-y1   = y2 - y1

If slopes are equal they form a straight line

From above formula we can convert it in to multiplication

x2-y1 * y2-y1 = x2-y1 *y2-y1

Since we have three points we will have common coordinates for second set in first value and first set ins econd value


T.C O(1)
S.C O(1)
