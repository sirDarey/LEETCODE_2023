package February;

import java.util.TreeSet;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 24: Problem 1675 - Minimize Deviation in Array
*/

public class _24_1675_MinimizeDeviationInArray {
	
	public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums)
            set.add(num%2 == 0? num : num*2);
        
        int minDev = Integer.MAX_VALUE;
        while (true) {
            int max = set.last();
            int min = set.first();

            minDev = Math.min(minDev, max-min);
            if (max%2 == 0) {
                set.add(max/2);
                set.remove(max);
            } else
                break;
        }
        return minDev;
    }
}
