package July;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, July 2023
 * Day 21: Problem 673 - Number of Longest Increasing Subsequence
 * 
 */

public class _21_673_NumberOfLongestIncreasingSubsequence {
	
	public int findNumberOfLIS(int[] nums) {
        int n = nums.length, max = 1;
        int[] dp = new int[n]; 
        int[] count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1); 

        for (int i=1; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j]+1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == max) {
                result += count[i];
            }
        }

        return result;
    }    
}
