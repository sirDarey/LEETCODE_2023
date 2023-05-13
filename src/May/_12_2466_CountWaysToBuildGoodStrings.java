package May;

import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 12: Problem 2466 - Count Ways To Build Good Strings
*/

public class _12_2466_CountWaysToBuildGoodStrings {
	
	public int countGoodStrings(int low, int high, int zero, int one) {
        List<Integer> dp = new ArrayList<>();
        dp.add(1);
        int total = 0, MOD = 1000000007;

        for (int i=1; i<=high; i++){
            int temp = 0;

            if (i-zero >= 0) 
                temp = dp.get(i-zero) % MOD;
            if (i-one >= 0) 
                temp = (temp + dp.get(i-one)) % MOD;

            dp.add(temp);
            if (low <= i) {
                total = (total + dp.get(i)) % MOD;
            }
        }
        return total;
    }
}
