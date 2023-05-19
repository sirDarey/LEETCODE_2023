package May.Random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 506 -  Relative Ranks
*/

public class _506_RelativeRanks {
	
	public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String [] result = new String [n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++)
            map.put(score[i], i);
        
        Arrays.sort(score);
        result[map.get(score[n-1])] = "Gold Medal";
        if (n > 1) result[map.get(score[n-2])] = "Silver Medal";
        if (n > 2) result[map.get(score[n-3])] = "Bronze Medal";

        int i = n-4;
        while (i >= 0) {
            result[map.get(score[i])] = String.valueOf(n-i);
            i--;
        }
        return result;
    }
}
