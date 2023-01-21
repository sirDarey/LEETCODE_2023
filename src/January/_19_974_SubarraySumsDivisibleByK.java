package January;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 19: 974 - SubArray Sums Divisible by K
 */

public class _19_974_SubarraySumsDivisibleByK {
    
	public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        Map <Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            int currentMod = Math.abs(nums[i]%k);
            map.put(currentMod, map.getOrDefault(currentMod, 0)+1);
        }

        int result = 0; 

        for (Map.Entry<Integer, Integer> x : map.entrySet()) {
            int currentValue = x.getValue();
            if (x.getKey() == 0) 
                result += ( (currentValue*(currentValue-1)) / 2) + currentValue;
            else
                result += (currentValue*(currentValue-1)) / 2;   
        }

        return result;
    }
}
