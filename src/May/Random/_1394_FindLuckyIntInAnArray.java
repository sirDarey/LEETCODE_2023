package May.Random;

import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1394 - Find Lucky Integer in an Array
*/

public class _1394_FindLuckyIntInAnArray {
	
	public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int result = -1;
        int i = 0, j, n = arr.length;
        while (i < n) {
            j = i+1;
            while  (j < n && arr[j] == arr[i]) 
                j++;
            if (j-i == arr[i])
                result = arr[i];
            i = j;
        }
        return result;
    }
}
