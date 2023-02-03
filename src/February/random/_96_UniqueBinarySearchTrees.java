package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 96 - Unique Binary Search Trees
*/

public class _96_UniqueBinarySearchTrees {
	
	public int numTrees(int n) {
        int [] dp = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
    
        for (int i=2; i<=n; i++) {
            int temp = 0;
            for (int j=0; j<i; j++) 
                temp += dp[j] * dp[i-j-1];
            dp[i] = temp;
        }
        return dp[n];
    }
}
