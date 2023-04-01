package April;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 1: Problem 704 Binary Search
*/

public class _1_704_BinarySearch {
	public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid+1;
            if (nums[mid] > target) right = mid-1;
        }
        return -1;
    }
}
