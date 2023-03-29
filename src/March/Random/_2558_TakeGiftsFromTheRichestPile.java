package March.Random;

import java.util.PriorityQueue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2558 - Take Gifts From the Richest Pile
*/

public class _2558_TakeGiftsFromTheRichestPile {
	
	public long pickGifts(int[] gifts, int k) {
        PriorityQueue <Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        for (int gift : gifts)
            pq.offer(gift);
        
        while (k > 0){
            pq.offer((int)Math.sqrt(pq.poll()));
            k--;
        }

        long result = 0;
        while (!pq.isEmpty())
            result += pq.poll();
        
        return result;
    }
}
