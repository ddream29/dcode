You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
    
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        if(coordinates.length==1)
        {
            return true;
        }
        
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        
        for(int i=1;i<coordinates.length;i++)
        {
            int x1 = coordinates[i - 1][0];
		    int y1 = coordinates[i - 1][1];

		    int x2 = coordinates[i][0];
		    int y2 = coordinates[i][1];
            
            if((y2 - y1) * (x1 - x0)!=(y1 - y0) * (x2 - x1)) return false;

        }
        
      return true;  
        
    }
}

Slope should be same for all the points 

x = y2-y1/x2-x1;

x2-x1   x1-x0
..... = ....
y2-y1   y1-y0

T.C O(N)
S.C O(1)
