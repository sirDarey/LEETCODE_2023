package June;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 8: Problem 1351 - Count Negative Numbers in a Sorted Matrix
 * 
 */

public class _8_1351_CountNegativeNumbersInASortedMatrix {
	
	public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length - 1, count = 0;
        for (int i=0; i<m; i++) {
            count += n - find(0, n, grid, i) + 1;
        }
        return count;
    }

    int find (int l, int r, int [][] grid, int i) {
        int mid = r;
        while (l <= r) {
            mid = (l + r)/2;

            if (grid[i][mid] >= 0)
                l = mid + 1;
            else if (grid[i][mid] < 0)
                r = mid - 1;                
        }
        return l;
    }
}
