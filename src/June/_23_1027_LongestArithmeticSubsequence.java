package June;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 23: Problem 1027 - Longest Arithmetic Subsequence
 * 
 */

public class _23_1027_LongestArithmeticSubsequence {
	
	public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        @SuppressWarnings("unchecked")
		Map <Integer, Integer> [] dp = new HashMap  [n];
        int result = 0;

        for (int i=0; i<n; i++) {
            dp [i] = new HashMap<>();

            for (int j=0; j<i; j++) {
                int diff = nums[j] - nums[i];
                dp[i].put(diff, dp[j].getOrDefault(diff, 1)+1);
                result = Math.max(result, dp[i].get(diff));
            }
        }
        return result;
    }
}
