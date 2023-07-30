package July.Random;
/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2529 - Maximum Count of Positive Integer and Negative
* 
*/

public class _2529_MaxCountOfPositiveIntegerAndNegative {
	
	public int maximumCount(int[] nums) {
        int neg = 0, i = 0, n = nums.length;
        while (i < n && nums[i] < 0) {
            neg++; i++;
        }
        while (i < n && nums[i] == 0)
            i++;
        return Math.max(neg, n-i);
    }
}
