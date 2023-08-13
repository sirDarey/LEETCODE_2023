package August;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, August 2023
* Day 12: Problem 63 - Unique Paths II
* 
*/

public class _12_63_UniquePaths2 {
	
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int [][] dp = new int [m][n];

        if (obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1)
            return 0;

        if (m == 1) {
            for (int j=1; j<n; j++)
                if (obstacleGrid[0][j] == 1)
                    return 0;
            return 1;
        }

        if (n == 1) {
            for (int i=1; i<m; i++)
                if (obstacleGrid[i][0] == 1)
                    return 0;
            return 1;
        }

        for (int i=m-2; i>=0; i--) 
            dp[i][n-1] = (obstacleGrid[i][n-1] == 0 && dp[i+1][n-1] != -1)? 1 : -1;
        
        for (int j=n-2; j>=0; j--) 
            dp[m-1][j] = (obstacleGrid[m-1][j] == 0 && dp[m-1][j+1] != -1)? 1 : -1;

        for (int i=m-2; i>=0; i--) {
            for (int j=n-2; j>=0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = -1;
                    continue;
                }
                int x = (dp[i+1][j] == -1)? 0 : dp[i+1][j];
                int y = (dp[i][j+1] == -1)? 0 : dp[i][j+1];
                dp[i][j] = x+y;
            }
        }
        return dp[0][0];
    }
}
