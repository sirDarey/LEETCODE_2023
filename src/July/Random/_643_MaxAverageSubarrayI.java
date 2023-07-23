package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 643 - Maximum Average Subarray I
*/

public class _643_MaxAverageSubarrayI {
	
	public double findMaxAverage(int[] nums, int k) {
        double max = 0, sum = 0d;
        int i = 0, n = nums.length;
        while (i < k) 
            sum += nums[i++];
        max = sum;
        while (i < n) {
            sum -= nums[i-k];
            sum += nums[i++];
            max = Math.max(max, sum);
        }
        return max/k;
    }
}
