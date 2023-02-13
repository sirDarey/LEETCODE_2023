package February.random;

import java.util.HashSet;
import java.util.Set;

/**
*
* @Sir Darey
* 
* LeetCode Problem 416 - Partition Equal Subset Sum
*/

public class _416_PartitionEqualSubsetSum {
	
	public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums)
            sum += i;

        if (sum%2 == 1)
            return false;
        
        int target = sum/2;
        Set<Integer> dp = new HashSet<>();
        dp.add(0);
        
        for (int i=nums.length-1; i>=0; i--) {
            Set<Integer> temp = new HashSet<>();
            for (int num : dp) {                
                temp.add(num + nums[i]);
                temp.add(num);
            }
            if (temp.contains(target))
                    return true;
            dp = temp;
        }
        return false;
    }
}
