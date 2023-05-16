package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2176 - Count Equal and Divisible Pairs in an Array
*/

public class _2176_CountEqualAndDivisiblePairsInAnArray {
	
	public int countPairs(int[] nums, int k) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            int current = nums[i];
            for (int j=i+1; j<nums.length; j++) {
                if (nums[j] == current && (i * j)%k == 0)
                    count++;
            }
        }
        return count;
    }
}
