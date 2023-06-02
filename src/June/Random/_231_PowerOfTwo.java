package June.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 231 - Power of Two
*/

public class _231_PowerOfTwo {
	
	public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        return (n%2 == 0 && isPowerOfTwo(n/2));
    }
}
