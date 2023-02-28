package February;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 26: Problem 72 - EditDistance
*/

public class _26_72_EditDistance {
	
	public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int [][] dp = new int [m+1][n+1];
        
        for (int i=0; i<=m; i++)
            dp[i][0] = i;
        for (int j=0; j<=n; j++)
            dp[0][j] = j;
        
        for (int i=1; i<=m; i++) {
            int x = i-1;
            
            for (int j=1; j<=n; j++) {
                
                int y = j-1;
                if (word1.charAt(x) == word2.charAt(y))
                    dp[i][j] = dp[x][y];
                else 
                    dp[i][j] = 1 + Math.min(Math.min(dp[x][y], dp[i][y]), dp[x][j]);
            }
        }
        
        return dp[m][n];
    }
}
