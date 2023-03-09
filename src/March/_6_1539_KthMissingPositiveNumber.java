package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 6: Problem 1539 - Kth Missing Positive Number
*/

public class _6_1539_KthMissingPositiveNumber {
	
	public int findKthPositive(int[] arr, int k) {
        int n = arr.length, left = 0, right = n-1,
        missing = arr[right] - n;

        while (left <= right) {
            int mid = left + (right - left)/2;
            missing = arr[mid] - mid - 1;

            if (missing >= k) 
                right = mid-1;
            else
                left = mid+1;
        }

        if (right == -1)
            return k;
        
        return k + right + 1;
    }
}
