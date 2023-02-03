package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 97 - Interleaving String
*/

public class _97_InterleavingString {
	
	public boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length();
        if (m+n != s3.length())
            return false;
        
        boolean [][] dp = new boolean[m+1][n+1];
        dp[m][n] = true;

        for (int i=m; i>-1; i--) {
            for (int j=n; j>-1; j--) {
                if (i<m && s1.charAt(i) == s3.charAt(i+j) && dp[i+1][j]) {
                    dp[i][j] = true;
                    continue;
                }                    
                if (j<n && s2.charAt(j) == s3.charAt(i+j) && dp[i][j+1])
                    dp[i][j] = true;
            }
        }

        return dp[0][0];
    }
}
