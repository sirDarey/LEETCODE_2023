package June.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1299 - Replace Elements with Greatest Element on Right Side
*/

public class _1299_ReplaceElementsWithGreatestElementOnRightSide {
	
	public int[] replaceElements(int[] arr) {
        int n = arr.length, max = -1;

        for (int i=n-1; i>=0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }
}
