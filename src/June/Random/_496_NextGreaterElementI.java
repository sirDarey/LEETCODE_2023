package June.Random;

import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 496 - Next Greater Element I
*/

public class _496_NextGreaterElementI {
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int [] result = new int [m];
        Arrays.fill(result, -1);

        for (int i=0; i<m; i++) {
            int current = nums1[i];
            int j = 0;
            while (j < n) {
                if (nums2[j] == current) {
                    while (j < n) {
                        if (nums2[j] > current) {
                            result[i] = nums2[j];
                            break;
                        }
                        else
                            j++;
                    }
                    break;
                } else
                    j++;
            }
        }
        return result;
    }
}
