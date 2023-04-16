package April.Random;

import java.util.HashMap;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 697 - Degree of an Array
*/

public class _697_DegreeOfAnArray {
	
	public int findShortestSubArray(int[] nums) {
        // freq, start, end
        Map<Integer, int[]> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) { // 1->[2,0,4], 2->[3,1,6], 3->[1,3,3], 4->[1,5,5]
            int current = nums[i]; //m =2, ml=4

            if (map.containsKey(current)) {
                int [] value = map.get(current);
                map.put(current, new int[] {++value[0], value[1], i});
            } else
                map.put(current, new int[] {1, i, i});
        }

        int maxFreq = 0, minLength = 49999; 
        for (int[] value : map.values()) {
        	if (value[0] > maxFreq) {
        		maxFreq = value[0];
        		minLength = value[2]-value[1];
        	} else if (value[0] == maxFreq) {
        		minLength = Math.min(minLength, value[2]-value[1]);
        	}       		
        }
        return minLength+1;
    }
}
