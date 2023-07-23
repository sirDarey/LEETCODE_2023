package July.Random;

import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1748 - Sum of Unique Elements
* 
*/

public class _1748_SumOfUniqueElements {
	
	public int sumOfUnique(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];

        Arrays.sort(nums);
        int prev = 0, sum = 0;
        for (int i=1; i<n; i++) {
            if (nums[i] != nums[i-1]) {
                if (i-prev == 1)
                    sum += nums[prev];
                prev = i;
            }
        }
        if (nums[n-1] != nums[n-2])
            sum += nums[n-1];
        return sum;
    }
}
