package August;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, August 2023
* Day 13: Problem 2369 - Check if There is a Valid Partition For The Array
* 
*/

public class _13_2369_CheckIfThereIsAValidPartitionForTheArray {
	
	public boolean validPartition(int[] nums) {
        int n = nums.length;
        Boolean [] memo = new Boolean [n];
        return isValid (nums, 0, n, memo);
    }

    boolean isValid(int [] nums, int i, int n, Boolean [] memo) {
        if (i == n)
            return true;
        if (memo[i] != null)
            return memo[i];

        boolean flag = false;
        
        if (i+1 < n && nums[i] == nums[i+1]) 
            flag = isValid(nums, i+2, n, memo);
        
        if (!flag && i+2 < n && ( 
                    (nums[i] == nums[i+1] && nums[i] == nums[i+2]) || 
                    (nums[i]+1 == nums[i+1] && nums[i+1]+1 == nums[i+2]) 
                ) 
            ) 
            flag = isValid (nums, i+3, n, memo);
        
        memo[i] = flag;
        return flag;
    }
}
