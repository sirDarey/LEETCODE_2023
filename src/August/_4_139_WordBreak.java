package August;

import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, August 2023
* Day 4: Problem 139 - Word Break
* 
*/

public class _4_139_WordBreak {
	 public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean [] dp = new boolean[n+1];
        dp[n] = true;

        for (int i=n-1; i>=0; i--) {
            for (String word : wordDict) {
                int m = word.length();
                if (i+m <= n && dp[i+m] && s.substring(i, i+m).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[0];
	 }
}
