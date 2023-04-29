package April.Random;

import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2206 - Divide Array Into Equal Pairs
* 
* 
*/

public class _2206_DivideArrayIntoEqualPairs {
	public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i+=2) {
            if (nums[i] != nums[i-1])
                return false;
        }
        return true;
    }
}
