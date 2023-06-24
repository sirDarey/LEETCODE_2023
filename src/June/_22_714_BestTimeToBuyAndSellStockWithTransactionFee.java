package June;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 22: Problem 714 - Best Time to Buy and Sell Stock with Transaction Fee
 * 
 */

public class _22_714_BestTimeToBuyAndSellStockWithTransactionFee {
	
	public int maxProfit(int[] prices, int fee) {
        int profit = 0, stock = -prices[0];

        for (int i=1; i<prices.length; i++) {
            int prev = stock;
            stock = Math.max(stock, profit - prices[i]);
            profit = Math.max(profit, prev + prices[i] - fee);
        }
        return profit;
    }
}
