package January.Random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 509 - Fibonacci Number
*/

public class _509_FibonacciNumber {
	
	public int fib(int n) {
        if (n < 2)
            return n;
        int [] dp = new int[n+1];
        dp[1] = 1;
        
        for (int i=2; i<=n; i++)
            dp[i] = dp[i-2] + dp[i-1];
        
        return dp[n];
    }
}
