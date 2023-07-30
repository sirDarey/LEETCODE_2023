package July.Random;

import java.util.HashMap;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1640 - Check Array Formation Through Concatenation
* 
*/

public class _1640_CheckArrayFormationThroughConcatenation {
	
	 public boolean canFormArray(int[] arr, int[][] pieces) {
        Map <Integer, int[]> map = new HashMap<>();
        for (int [] piece : pieces) 
            map.put(piece[0], piece);

        int i = 0, n = arr.length;
        while (i < n) {
            if (map.containsKey(arr[i])) {
                int[] current = map.get(arr[i]);
                int j = 0;
                while (j < current.length) {
                    if (arr[i++] != current[j++])
                        return false;
                }
            } else 
                return false;
        } 
        return true;
    }
}
