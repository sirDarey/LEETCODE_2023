package June;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 20: Problem 2090 - K Radius SubArray Averages
 * 
 */

public class _20_2090_KRadiusSubarrayAverages {
	
	public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        if (k == 0)
            return nums;
        
        int [] result = new int [n];
        Arrays.fill(result, -1);
        int numOfItems = (2*k) + 1;
        if (n < numOfItems)
            return result;
        long sum = 0;

        for (int i=0; i<numOfItems; i++)
            sum += nums[i];
        result[k] = (int)(sum/numOfItems);

        for (int i=k+1; i<n-k; i++) {
            sum += nums[i+k];
            sum -= nums[i-k-1];
            result[i] = (int)(sum/numOfItems);
        }

        return result;
    }
}
