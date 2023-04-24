package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2485 - Find The Pivot Integer
* 
* 
*/

public class _2485_FindThePivotInteger {
	public int pivotInteger(int n) {
        int l = 1, r = n, mid;
        int totalSum = sum(n);

        while (l <= r) {
            mid = (l + r)/2;
            int midSum = sum(mid);
            int otherSum = totalSum-midSum+mid;

            if (midSum == otherSum)
                return mid;
            else if(midSum > otherSum)
                r = mid-1;
            else
                l = mid+1;
        }
        return -1;
    }

    int sum (int n) {
        // S = n/2 [n + 1]
        return (int)((n/2.0)* (n+1));
    }
}
