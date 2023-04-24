package April;

import java.util.Collections;
import java.util.PriorityQueue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 24: Problem 1046 - Last Stone Weight
*/

public class _24_1046_LastStoneWeight {
	
	public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> q = new PriorityQueue<>(Collections.reverseOrder()); 
        
        for (int i : stones) 
            q.offer(i);
        
        while (q.size() > 1) {
            int difference = q.poll() - q.poll();
            if (difference > 0)
                q.offer(difference);
        }
        
        return q.isEmpty()? 0 : q.poll();
    }
}
