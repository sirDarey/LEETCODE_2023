package January.Random;

import java.util.Arrays;

/**
*
* @Sir Darey
* 
* LeetCode Problem 274 - H-Index
*/

public class _274_H_Index {
	
	public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        int i = n-1, h = 0;
        while(i>=0 && citations[i] >= h+1) {
            i--;
            h++;
        }

        return h;
    }
}
