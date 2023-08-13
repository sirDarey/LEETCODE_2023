package August;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, August 2023
* Day 11: Problem 518 - Coin Change II
* 
*/

public class _11_518_CoinChange2 {
	
	public int change(int amount, int[] coins) {
        int n = coins.length;
        int [] dp = new int [amount+1];
        dp [0] = 1;
        
        for (int i=1; i<=n; i++) {
            int coin = coins[i-1];
            for (int j=coin; j<=amount; j++) {
                dp [j] += dp [j-coin];
            }
        }

        return dp [amount];
    }
}
