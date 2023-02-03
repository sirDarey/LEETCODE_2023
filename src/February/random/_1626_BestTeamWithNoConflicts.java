package February.random;

import java.util.Arrays;

/**
*
* @Sir Darey
* 
* LeetCode Problem 1626 - Best Team With No Conflicts
*/

public class _1626_BestTeamWithNoConflicts {
	
	public int bestTeamScore(int[] scores, int[] ages) {
        int n = ages.length;
        int [][] dp = new int [n][2];

        for (int i=0; i<n; i++) {
            dp[i][0] = scores[i];
            dp[i][1] = ages[i];
        }
        
        Arrays.sort(dp, (a,b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]);
        
        int maxSoFar = dp[0][0];

        for (int i=1; i<n; i++) {
            int currentScore = dp[i][0];

            for (int j=0; j<i; j++) {
                if (dp[j][1] <= dp[i][1]) {
                   dp[i][0] = Math.max(dp[j][0]+currentScore, dp[i][0]);
                }  
            }
            maxSoFar = Math.max(maxSoFar, dp[i][0]);
        }

        return maxSoFar;
    }
}
