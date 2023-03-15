package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 4: Problem 2444 -  Count Subarrays With Fixed Bounds
*/

public class _4_2444_CountSubarraysWithFixedBounds {
	
	 public long countSubarrays(int[] nums, int minK, int maxK) {
	        boolean foundMin = false, foundMax = false;
	        int start = 0, minStart = 0, maxStart = 0, n = nums.length;
	        long result = 0;

	        for (int i=0; i<n; i++){
	            int num = nums[i];

	            if (num < minK || num > maxK) {
	                foundMin = false;
	                foundMax = false;
	                start = i+1;
	            }

	            if (num == minK) {
	                foundMin = true;
	                minStart = i;
	            }

	            if (num == maxK) {
	                foundMax = true;
	                maxStart = i;
	            }

	            if (foundMin && foundMax)
	                result += (Math.min(minStart, maxStart) - start + 1);
	        }
	        return result;
	    }
}
