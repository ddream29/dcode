
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.


class Solution {
    public int maxArea(int[] height) {
        
      int area=0;
      int left=0;
      int right=height.length-1;
        
      while(left<right)
      {
          area = Math.max(area,Math.min(height[left],height[right])*(right-left));
          if(height[left]<height[right])
          {
              left++;
          }
          else
          {
              right--;
          }
      }
        
      return area;
        
    }
}

Left right
area = l*w
        minHeight till now*(right-left)
    
we will be calculating the area for each so we will be moving the smaller height front ;

Complexity Analysis

Time complexity : O(n). Single pass.

Space complexity : O(1). Constant space is used.
