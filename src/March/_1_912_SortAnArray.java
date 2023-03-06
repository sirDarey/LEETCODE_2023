package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 1: Problem 912 - Sort An Array
*/

public class _1_912_SortAnArray {
	
	public int[] sortArray(int[] nums) {
        int [] temp = new int[nums.length];
        sort (nums, temp, 0, nums.length-1);
        return nums;
    }

    void sort(int [] nums, int [] temp, int low, int high) {
        if (low < high) {
            int mid = (low + high)/2;

            sort(nums, temp, low, mid);
            sort(nums, temp, mid+1, high);

            merge(nums, temp, low, mid, high);
        }
    }

    void merge(int[]nums, int[]temp, int low, int mid, int high) {
        for (int i=low; i<=high; i++)
            temp[i] = nums[i];

        int i=low, j=mid+1, k=low;

        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            nums[k] = temp[i];
            i++; k++;
        }
    }
}
