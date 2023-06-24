package June;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 19: Problem 1732 - Find the Highest Altitude
 * 
 */

public class _19_1732_FindTheHighestAltitude {
	
	public int largestAltitude(int[] gain) {
        int start = 0, max = 0;
        for (int i=0; i<gain.length; i++) {
            start += gain[i];
            max = Math.max(max, start);
        }
        return max;
    }
}
