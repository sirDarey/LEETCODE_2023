package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1779 - Find Nearest Point That Has the Same X or Y Coordinate
*/

public class _1779_FindNearestPointThatHasTheSameXOrYCoordinate {
	
	public int nearestValidPoint(int x, int y, int[][] points) {
        int result = -1, minDistance = Integer.MAX_VALUE;
        for (int i=0; i<points.length; i++) {
            if (points[i][0]==x || points[i][1]==y){
                int dist = Math.abs(points[i][0]-x) + Math.abs(points[i][1]-y);
                if (minDistance > dist){
                    result = i;
                    minDistance = dist;
                }
            }               
        }
        return result;
    }
}
