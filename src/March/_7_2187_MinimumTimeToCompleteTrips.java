package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 7: Problem 2187 - Minimum Time to Complete Trips
*/

public class _7_2187_MinimumTimeToCompleteTrips {
	
	public long minimumTime(int[] time, int totalTrips) {
        long temp = Long.MAX_VALUE;
        for (int t : time)
            temp = Math.min(temp, t);

        long left = temp; 
        long right = temp * totalTrips;

        while (left < right) {
            long mid = left + (right - left)/2;
            if (checkStatus(mid, time, totalTrips))
                right = mid;
            else
                left = mid+1;
        }
        return left;
    }

    boolean checkStatus  (long timeTaken, int [] time, int totalTrips) {
        long count = 0;

        for (int t : time)
            count += timeTaken/t;

        if(count >= totalTrips) {
            return true;
        } else
            return false;
    }
}
