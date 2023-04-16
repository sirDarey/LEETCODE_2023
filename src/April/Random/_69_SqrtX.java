package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 69 - Sqrt(x)
*/

public class _69_SqrtX {
	
	public int mySqrt(int x) {
        if (x < 2)
            return x; 

        long left = 0, right = x/2, mid = 0;
        while (left <= right) {
            mid = left + (right - left)/2;
            if (mid * mid > x)
                right = mid - 1;
            else if (mid * mid < x)
                left = mid + 1;
            else
                return (int)mid;
        }
        return (int)right;
    }
}
