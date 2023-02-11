package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 2266 - Count Number of Texts
*/

public class _2266_CountNumberOfTexts {
	
	public int countTexts(String pressedKeys) {
        int n = pressedKeys.length();
        int [] dp = new int [n+1];
        dp[0] = 1;
        int MOD = 1000000007;

        for (int i=1; i<=n; i++) {
            char c = pressedKeys.charAt(i-1);
            dp[i] = dp[i-1];

            if (i>=2 && pressedKeys.charAt(i-2)==c) dp[i] = (dp[i] + dp[i-2])%MOD;
            else continue;

            if (i>=3 && pressedKeys.charAt(i-3)==c) dp[i] = (dp[i] + dp[i-3])%MOD;
            else continue;

            if ((c=='7' || c=='9') && i>=4 && pressedKeys.charAt(i-4)==c) 
                dp[i] = (dp[i] + dp[i-4])%MOD;
        }
        return dp[n];
    }
}
