package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2656 - Maximum Sum With Exactly K Elements
*/

public class _2656_MaxSumWithExactlyKElements {
	
	public int maximizeSum(int[] nums, int k) {
        int maxNum = 0;
        for (int num : nums)
            maxNum = Math.max(maxNum, num);
        
        int result = maxNum;
        while (--k > 0) 
            result += (++maxNum);

        return result;
    }
}
