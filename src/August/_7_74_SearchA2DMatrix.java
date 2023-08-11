package August;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, August 2023
* Day 7: Problem 74 - Search a 2D Matrix
* 
*/

public class _7_74_SearchA2DMatrix {
	
	public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        
        int up = 0, down = m-1, c = n-1, mid = 0;
        while (up <= down) {
            mid = (up+down)/2;
            if (matrix[mid][0] > target)
                down = mid - 1;
            else if (matrix[mid][c] < target)
                up = mid + 1;
            else if (matrix[mid][c] > target)
                break;
            else
                return true;
        }

        int left = 0, right = c, r = mid;
        while (left <= right) {
            mid = (left+right)/2;
            int current = matrix[r][mid];
            if (current > target)
                right = mid - 1;
            else if (current < target)
                left = mid + 1;
            else
                return true;
        }
        return false;
    }
}
