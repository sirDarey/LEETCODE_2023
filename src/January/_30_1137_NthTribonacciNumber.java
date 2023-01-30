package January;

/**
*
* @Sir Darey
* 
* LeetCode Daily Challenge, January 2023
* Day 30: LeetCode Problem 1137 - N-th Tribonacci Number
*/

public class _30_1137_NthTribonacciNumber {
	
	public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n < 3)
            return 1;

        int [] dp = new int[n+1];
        dp[1]++; dp[2]++;
        
        for (int i=3; i<=n; i++)
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        
        return dp[n];
    }
}
