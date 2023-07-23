package July.Random;

import java.util.HashSet;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1695 - Maximum Erasure Value
* 
*/

public class _1695_MaxErasureValue {
	
	public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];

        int maxSum = nums[0], currentSum = maxSum, i = 0, j = 1;
        Set <Integer> set = new HashSet<>();
        set.add(maxSum);

        while(j < n) { 
            while (set.contains(nums[j])) {
                currentSum -= nums[i];
                set.remove(nums[i++]);
            }
            currentSum += nums[j];
            set.add(nums[j++]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
