package February;


/**
*
 @Sir Darey
 * 
 * LeetCode Daily Challenge, February 2023
 * Day 6: Problem 1470 - Shuffle the Array
*/

public class _6_1470_ShuffleTheArray {
	
	public int[] shuffle(int[] nums, int n) {
        int [] result = new int [2*n];

        for (int i=0; i<2*n; i+=2) {
            result[i] = nums[i/2];
            result[i+1] = nums[(i/2)+n];
        }
        return result;
    }
}
