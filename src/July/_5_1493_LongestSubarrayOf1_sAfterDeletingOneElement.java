package July;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, July 2023
 * Day 5: Problem 1493 - Longest Subarray of 1's After Deleting One Element
 */

public class _5_1493_LongestSubarrayOf1_sAfterDeletingOneElement {
	
	public int longestSubarray(int[] nums) {

        int n = nums.length, ones = 0, prevZeroIndex = -1;
        int max = ones;

        for (int i=0; i<n; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, ones);
                ones = i - prevZeroIndex -1; 
                prevZeroIndex = i;             
            } else 
                ones++;
        }
        max = Math.max(max, ones);
        return (ones == n)? n-1 : max;
    }
    
}
