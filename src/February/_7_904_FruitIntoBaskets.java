package February;

import java.util.HashMap;
import java.util.Map;

/**
*
 @Sir Darey
 * 
 * LeetCode Daily Challenge, February 2023
 * Day 7: Problem 904 - Fruit Into Baskets
*/

public class _7_904_FruitIntoBaskets {
	
	public int totalFruit(int[] fruits) {
        Map <Integer, Integer> map = new HashMap<>();
        int start = 0, max = 0, total = 0, n = fruits.length;
        
        for (int end=0; end < n; end++) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0)+1);
            total ++;

            while (map.size() > 2){
                Integer f = fruits[start];
                map.put(f, map.get(f)-1);
                if (map.get(f) == 0)
                    map.remove(f);

                total --;
                start++;
            }

            max = Math.max(max, total);
        }

        return max;
    }
}
