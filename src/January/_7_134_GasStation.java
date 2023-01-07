package January;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 7: 134 - Gas Station
 */

public class _7_134_GasStation {
    
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSoFar = 0, available = 0, index = 0;

        for (int i=0; i<gas.length; i++) {
            int diff = gas[i] - cost[i];
            gasSoFar += diff;
            available += diff; 

            if (available < 0) {
                available = 0;
                index = i+1;
            }
        }

        return (gasSoFar < 0)? -1 : index;
    }
}
