package May;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 2: Problem 1822 - Sign of the Product of an Array
*/

public class _2_1822_SignOfTheProductOfAnArray {
	public int arraySign(int[] nums) {
        int neg = 0;
        for (int i : nums) {
            if (i < 0)
                neg++;
            else if (i == 0)
                return 0;
        } 
        if (neg%2 == 0)
            return 1;
        else 
            return -1;
    }
}
