package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 221 - Maximal Square
*/

public class _221_MaximalSquare {
	
	public int maximalSquare(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int [][] dp = new int [m+1][n+1];
        int max = 0;

        for (int row=m-1; row>=0; row--) {
            for (int col=n-1; col>=0; col--) {
                if (matrix[row][col] != '0') {
                    dp[row][col] = 1 + Math.min(dp[row+1][col], 
                                Math.min(dp[row+1][col+1], dp[row][col+1]));
                    
                    max = Math.max(max, dp[row][col]);
                }
                   
            }
        }
        return max * max;
    }
}
