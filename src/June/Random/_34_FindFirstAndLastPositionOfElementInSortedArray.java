package June.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 34 - Find First and Last Position of Element in Sorted Array
* 
*/

public class _34_FindFirstAndLastPositionOfElementInSortedArray {
	
	int nums []; int target, n;

    public int[] searchRange(int[] nums, int target) {

        this.n = nums.length;

        if (n == 0)
            return new int [] {-1, -1};

        this.nums = nums;
        this.target = target;

        return new int [] {findFirst(), findLast()};
    }

    int findFirst () {
        int l = 0, r = n-1;

        while(l <= r) {
            int mid = (l+r)/2;
            if (nums[mid] >= target)
                r = mid-1;
            else
                l = mid+1;
        }
        return (l < 0 || l == n || nums[l] != target)? -1 : l;
    }

    int findLast () {
        int l = 0, r = n-1;

        while(l <= r) {
            int mid = (l+r)/2;
            if (nums[mid] > target)
                r = mid-1;
            else
                l = mid+1;
        }
        return (r == n || r < 0 || nums[r] != target)? -1 : r;
    }
}
