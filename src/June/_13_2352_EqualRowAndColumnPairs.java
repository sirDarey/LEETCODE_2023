package June;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 13: Problem 2352 - Equal Row and Column Pairs
 * 
 */

public class _13_2352_EqualRowAndColumnPairs {
	
	public int equalPairs(int[][] grid) {
        int n = grid.length;
        int pairs = 0;
        for (int r=0; r<n; r++) {
            int [] currentRow = grid [r];

            for (int c=0; c<n; c++) {
                int i = 0;
                while (i<n) {
                    if (grid[i][c] != currentRow[i])
                        break;
                    i++;
                }
                
                if (i == n)
                    pairs++;
            }            
        }
        return pairs;
    }
}
