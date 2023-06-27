package June;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 27: Problem 373 - Find K Pairs with Smallest Sums
 * 
 */

public class _27_373_FindKPairsWithSmallestSums {
	
	private class Pair <K, V> {
		K key; 
		V value;
		
		public Pair (K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		K getKey () {
			return key;
		}
		
		V getValue () {
			return value;
		}
	}
	
	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue <Pair<Integer, int[]>> pq = new PriorityQueue<>((a,b) -> b.getKey() - a.getKey());
    
        for (int i=0; i<nums1.length; i++)  {
            for (int j=0; j<nums2.length; j++) {
                
                int sum = nums1[i] + nums2[j];
                if (pq.size() < k) 
                    pq.offer(new Pair<>(sum, new int[] {nums1[i], nums2[j]}));
                else if (sum < pq.peek().getKey()) {
                    pq.poll();
                    pq.offer(new Pair<>(sum, new int[] {nums1[i], nums2[j]}));
                } else
                    break;
            }
        }

        while (!pq.isEmpty()) {
            int [] current = pq.poll().getValue();
            result.add(new ArrayList<>(List.of(current[0], current[1])));
        }

        return result;
    }
}
