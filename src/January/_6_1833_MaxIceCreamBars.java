package January;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 6: 1833 - Maximum Ice Cream Bars
 */

public class _6_1833_MaxIceCreamBars {
    
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int result = 0;
        for (int i=0; i<costs.length; i++) {
            if (coins >= costs[i]) {
                result ++;
                coins -= costs[i];
            } else
                return result;
        }
        return result;
    }
}
