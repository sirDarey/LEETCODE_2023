package March;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 22: Problem 2492 - Minimum Score of a Path Between Two Cities
* 
*/


public class _22_2492_MinimumScoreOfAPathBetweenTwoCities {
	
	Map <Integer, List<int[]>> adj = new HashMap<>();
    int result = 10000;

    public int minScore(int n, int[][] roads) {
        for (int i=1; i<=n; i++)
            adj.put(i, new ArrayList<>());

        for (int i=0; i<roads.length; i++) {
            adj.get(roads[i][0]).add(new int[]{roads[i][1], roads[i][2]});
            adj.get(roads[i][1]).add(new int[]{roads[i][0], roads[i][2]});
        }

        Queue <Integer> queue = new LinkedList<>();
        queue.offer(1);
        boolean [] visited = new boolean[n+1];
        
        while (!queue.isEmpty()) {
            int currentCity = queue.poll();
            visited[currentCity] = true;
            
            for (int [] child : adj.get(currentCity)) {
                int newCity = child[0], distance = child[1];
                if (visited[newCity])
                    continue;
                result = Math.min(result, distance);
                queue.offer(newCity);
            }
        }

        return result;
    }
}
