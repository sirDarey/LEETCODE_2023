package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 8: Problem 875 - Koko Eating Bananas
*/

public class _8_875_KokoEatingBananas {
	
		public int minEatingSpeed(int[] piles, int h) {
	        int minSpeed = Integer.MAX_VALUE,
	            left = 1, right = Integer.MAX_VALUE;
	        
	        while (left <= right) {
	            int k = left + (right - left)/2;
	            int time = 0;
	            
	            for (int i : piles) {
	                time +=  i/k;
	                if (i%k != 0)
	                    time++;
	            }
	             
	            if (time <= h) {
	                minSpeed = Math.min(minSpeed, k);
	                right = k - 1;
	            } else
	                left = k + 1;
	        }
	        return minSpeed;
	    }
}
