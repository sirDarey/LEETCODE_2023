package February;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 20: Problem 35 - Search Insert Position
*/

public class _20_35_SearchInsertPosition {
	
	public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length-1, mid=-1; 
        if (nums[j] < target)
            return j+1;
        else if (nums[0] > target)
            return 0;

        while (i < j){
            mid = i + (j-i)/2;

            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) 
                i = mid + 1;
            else
                j = mid;
        }
        return j;
    }
 
}
