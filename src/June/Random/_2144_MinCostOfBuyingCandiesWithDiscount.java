package June.Random;

import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2144 - Minimum Cost of Buying Candies With Discount
*/

public class _2144_MinCostOfBuyingCandiesWithDiscount {
	
	public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int minCost = 0, n = cost.length;

        for (int i=n-1; i>=0; i-=3) {
            minCost += cost[i];
        }
        for (int i=n-2; i>=0; i-=3) {
            minCost += cost[i];
        }

        return minCost;
        // 2  2  5  6  7  9
    }
}
