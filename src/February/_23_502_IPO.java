package February;

import java.util.PriorityQueue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 23: Problem 502 - IPO
*/

public class _23_502_IPO {
	
	public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        PriorityQueue<Integer> maxProfit = new PriorityQueue<>((a, b) -> b-a);
        PriorityQueue<int []> minCapital = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
        for (int i=0; i<n; i++) 
            minCapital.offer(new int [] {capital[i], profits[i]});

        for(int i=0; i<k; i++) {
            while (!minCapital.isEmpty() && minCapital.peek()[0] <= w) 
                maxProfit.offer(minCapital.poll()[1]);
            
            if (!maxProfit.isEmpty())
                w += maxProfit.poll();
            else
                return w;
        }
        return w;
    }
}
