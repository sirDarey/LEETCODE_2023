package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 20: Problem 605 - Can Place Flowers
* 
*/


public class _20_605_CanPlaceFlowers {
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;

        int m = flowerbed.length;
        if (n > (m+1)/2)
            return false;

        if (m == 1)
            return n==1 && flowerbed[0] == 0;

        if (m == 2) 
            return flowerbed[0] == 0 && flowerbed[1] ==0;
        
        if (flowerbed[0] == 0 && flowerbed[1] == 0) n--;
        for (int i=2; i<m; i+=2) {
            if (flowerbed[i] == 1 || flowerbed[i-1] == 1 || (i+1<m && flowerbed[i+1] == 1))
                continue;
            n--;
        }
        if (m%2==0 && flowerbed[m-1] == 0 && flowerbed[m-2] == 0) n--;
        return n <= 0;
    }
}
