package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1385 - Find the Distance Value Between Two Arrays
*/

public class _1385_FindTheDistanceValueBtwTwoArrays {
	
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;
        for (int i=0; i<arr1.length; i++) {
            int curr = arr1[i];
            int j = 0;
            while (j < arr2.length) {
                if (Math.abs(curr - arr2[j]) <= d)
                    break;
                j++;
            }
            if (j == arr2.length)
                result++;
        }
        return result;
    }
}
