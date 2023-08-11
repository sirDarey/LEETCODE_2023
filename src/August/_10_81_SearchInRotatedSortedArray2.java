package August;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, August 2023
* Day 10: Problem 81 - Search in Rotated Sorted Array II
* 
*/

public class _10_81_SearchInRotatedSortedArray2 {
	
	public boolean search(int[] nums, int target) {
        for (int num : nums)
            if (num == target)
                return true;
        return false;
    }
}
