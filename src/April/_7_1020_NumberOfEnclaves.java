package April;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 7: Problem 1020 - Number of Enclaves
*/

public class _7_1020_NumberOfEnclaves {
	public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        for (int i=0; i<m; i++) {
            changeOneToZero(i, 0, m, n, grid);
            changeOneToZero(i, n-1, m, n, grid);
        }

        for (int j=0; j<n; j++) {
            changeOneToZero(0, j, m, n, grid);
            changeOneToZero(m-1, j, m, n, grid);
        }
        
        int result = 0;
        for (int i=1; i<m; i++) 
            for (int j=1; j<n; j++) 
                result += dfs(i, j, grid);
        
        return result;
    }

    void changeOneToZero (int r, int c, int m, int n, int [][] grid) {
        if (r==m || c==n || r<0 || c<0 || grid[r][c]==0)
            return;

        grid[r][c] = 0;
        changeOneToZero (r-1, c, m, n, grid);
        changeOneToZero (r+1, c, m, n, grid);
        changeOneToZero (r, c-1, m, n, grid);
        changeOneToZero (r, c+1, m, n, grid);
    }

    int dfs(int r, int c, int [][] grid) {
        if (grid[r][c] == 0)
            return 0;
        
        grid[r][c] = 0;
        return 1    + dfs (r-1, c, grid)
                    + dfs (r+1, c, grid)
                    + dfs (r, c-1, grid)
                    + dfs (r, c+1, grid);
    }
}
