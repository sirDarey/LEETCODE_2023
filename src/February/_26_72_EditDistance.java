package February;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 25: Problem 121 - Best Time to Buy and Sell Stock
*/

public class _26_72_EditDistance {
	
	public int maxProfit(int[] prices) {
        int result = 0, minCP = prices[0];
        
        for (int i=1; i<prices.length; i++) {
            result = Math.max(result, prices[i] - minCP);
            minCP = Math.min(minCP, prices[i]);
        }
        return result;
    }
}
