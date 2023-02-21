package February;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 21: Problem 540 - Single Element in a Sorted Array
*/

public class _21_540_SingleElementInASortedArray {
	
	public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length-1;
        
        while (left < right) {
            int mid = left + (right-left)/2;

            if (nums[mid] == nums[mid+1]) {
                if ((right - mid)%2 == 1)
                    right = mid - 1;
                else 
                    left = mid + 1;
            } else if (nums[mid] == nums[mid-1]) {
                if ((right-mid)%2 == 0)
                    right = mid;
                else
                    left = mid + 1;
            } else
                return nums[mid];
        }
        return nums[right];
    }
}
