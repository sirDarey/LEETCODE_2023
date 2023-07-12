package July.Random;

import java.util.Map;
import java.util.TreeMap;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1122 - Relative Sort Array
* 
*/

public class _1122_RelativeSortArray {
	
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr1)
            map.put(num, map.getOrDefault(num, 0)+1);
        
        int [] result = new int[arr1.length];
        int i = 0;
        for (int num : arr2) {
            int freq = map.get(num);
            while (freq-- > 0) {
                result [i] = num;
                i++;
            }
            map.remove(num);
        }

        for (Map.Entry <Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int freq = map.get(key);
            while (freq-- > 0) {
                result [i] = key;
                i++;
            }
        }
        return result;
    }
}
