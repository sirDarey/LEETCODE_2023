package February;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 22: Problem 1011 - Capacity To Ship Packages Within D Days
*/

public class _22_1011_CapacityToShipPackagesWithinDDays {
	
	public int shipWithinDays(int[] weights, int days) {
        int left = 0, right =0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        int result = right;

        while (left <= right) {
            int capacity = (left + right)/2;

            if (canShip(capacity, days, weights)) {
                result = Math.min(result, capacity);
                right = capacity - 1;
            } else 
                left = capacity + 1;
        }
        return result;
    }

    boolean canShip(int capacity, int days, int [] weights) {
        int ships = 1, currentCapacity = capacity;
        for (int weight : weights) {
            if (currentCapacity - weight < 0) {
                ships++;
                if(ships > days)
                    return false;
                currentCapacity = capacity;
            }
            currentCapacity -= weight;
        }
        return ships <= days;
    }
}
