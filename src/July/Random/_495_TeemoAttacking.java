package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 495 - Teemo Attacking
* 
*/

public class _495_TeemoAttacking {
	
	public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = duration, minus = 0;

        for(int i=1; i<timeSeries.length; i++) {
            time += duration;
            minus += Math.max(timeSeries[i-1]+duration-timeSeries[i], 0);
        }
        return time - minus;
    }
}
