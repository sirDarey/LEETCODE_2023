package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 27 - Remove Element
*/

public class _27_RemoveElement {
	
	public int removeElement(int[] nums, int val) {
        int total = nums.length;
        int index = 0;
        int i;
        for (i=0; i<total; i++) {

            if (nums[i] != val) {
                nums[index] = nums[i];
                index ++;
            }
                
        }
        return index; 
    }
}
