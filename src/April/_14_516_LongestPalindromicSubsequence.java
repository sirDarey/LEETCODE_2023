package April;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 14: Problem 516 - Longest Palindromic Subsequence
*/

public class _14_516_LongestPalindromicSubsequence {
	public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int [][] dp = new int [n][n];
        
        for (int i=0; i<n; i++) 
            dp[i][i] = 1;
        
        for (int i=n-2; i>=0; i--) {
            for (int j=i+1; j<n; j++) {
                if (s.charAt(i) == s.charAt(j)) 
                    dp[i][j] = dp[i+1][j-1] + 2;
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
            }
        }
        
        return dp[0][n-1];
    }
}
