package April;

import java.util.PriorityQueue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 25: Problem 2336 - Smallest Number in Infinite Set
*/

public class _25_2336_SmallestNumberInInfiniteSet {
	
	PriorityQueue <Integer> pq;
    public _25_2336_SmallestNumberInInfiniteSet() {
        pq = new PriorityQueue<>();
        for (int i=1; i<=1000; i++)
            pq.offer(i);
    }
    
    public int popSmallest() {
        return pq.poll();
    }
    
    public void addBack(int num) {
        if (!pq.contains(num))
            pq.offer(num);
    }
}
