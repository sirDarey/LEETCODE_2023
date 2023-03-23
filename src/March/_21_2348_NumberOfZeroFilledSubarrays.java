package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 21: Problem 2348 - Number of Zero-Filled Sub Arrays
* 
*/


public class _21_2348_NumberOfZeroFilledSubarrays {
	
	public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        int n = nums.length, start = 0;

        while (start < n) {
            int end = start;
            if (nums[start] == 0) {                
                while (end < n && nums[end] == 0){
                    result += end - start + 1;
                    end ++;
                }
            }
            start = end + 1;
        }
        return result;
    }
}
