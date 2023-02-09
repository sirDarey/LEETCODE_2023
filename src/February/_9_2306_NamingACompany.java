package February;

/**
*
* @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 9: Problem 2306 - Naming a Company
*/

public class _9_2306_NamingACompany {
	
	public int maxResult(int[] nums, int k) {
        int n = nums.length;
        for (int i=1; i<n; i++) {
            int maxBeforeI = Integer.MIN_VALUE;

            for(int j=Math.max(0, i-k); j<i; j++) 
                maxBeforeI = Math.max(maxBeforeI, nums[j]);
            nums[i] += maxBeforeI;
        }
        return nums[n-1];
    }
}
