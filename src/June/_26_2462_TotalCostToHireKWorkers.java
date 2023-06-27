package June;

import java.util.PriorityQueue;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 26: Problem 2462 - Total Cost to Hire K Workers
 * 
 */

public class _26_2462_TotalCostToHireKWorkers {
	
	public long totalCost(int[] costs, int k, int candidates) {
        int i = 0, j = costs.length-1;
        PriorityQueue <Integer> pq1 = new PriorityQueue<>(),
                                pq2 = new PriorityQueue<>();
        long result = 0;

        while (k-- > 0) {
            while (pq1.size() < candidates && i <= j) 
                pq1.offer(costs[i++]);
            while (pq2.size() < candidates && i <= j) 
                pq2.offer(costs[j--]);
            
            int p1 = pq1.size() > 0? pq1.peek() : Integer.MAX_VALUE;
            int p2 = pq2.size() > 0? pq2.peek() : Integer.MAX_VALUE;

            if (p1 <= p2) 
                result += pq1.poll();
            else
                result += pq2.poll();
        }
        
        return result;
    }
}
