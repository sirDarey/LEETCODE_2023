package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 905 - Sort Array By Parity
*/

public class _905_SortArrayByParity {
	
	public int[] sortArrayByParity(int[] nums) {
        int i=0, j=nums.length-1;
        while (i < j) {
            if (nums[j]%2 == 1)
                j--;
            else {
                if (nums[i]%2 == 1) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j--;
                } 
                i++;
            }
        }
        return nums;
    }
}
