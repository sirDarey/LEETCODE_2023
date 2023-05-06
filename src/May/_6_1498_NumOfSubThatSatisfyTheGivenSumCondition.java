package May;

import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 6: Problem 1498 - Number of Subsequences That Satisfy the Given Sum Condition
*/

public class _6_1498_NumOfSubThatSatisfyTheGivenSumCondition {
	public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int  i = 0, j = nums.length-1, count = 0, MOD = 1000000007;
        int [] pow = new int [j+1];
        pow[0] = 1;
        for (int k=1; k<=j; k++) {
            pow[k] = (pow[k-1]*2) % MOD;
        }

        while (i <= j) {
            int sum = nums[i] + nums[j];
            if (sum > target) {
                j--;
                continue;
            }
            count += pow[j-i];
            count %= MOD;
            i++;
        }
        return count;
    }
}
