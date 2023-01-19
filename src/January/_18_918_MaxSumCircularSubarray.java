package January;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 19 : 918 - Maximum Sum Circular Subarray
 */

public class _18_918_MaxSumCircularSubarray {
    
	public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int MAX = nums[0], MIN = MAX, max = MAX, min = MAX;
        int total = MAX;
        
        for (int i=1; i<n; i++) {
            max = Math.max(nums[i], max+nums[i]);
            MAX = Math.max(MAX, max);

            min = Math.min(nums[i], min+nums[i]);
            MIN = Math.min(MIN, min);

            total += nums[i];
        }
        
        if (MAX < 0)
            return MAX;

        return Math.max(MAX, total-MIN);
    }
}
