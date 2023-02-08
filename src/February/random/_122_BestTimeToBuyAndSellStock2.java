package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 122 - Best Time To Buy And Sell Stock II
*/

public class _122_BestTimeToBuyAndSellStock2 {
	
	public int maxProfit(int[] prices) {
        int max = 0;

        for (int i=1; i<prices.length; i++) 
            if (prices[i] > prices[i-1])
                max += prices[i] - prices[i-1];
        
        return max;
    }
}
