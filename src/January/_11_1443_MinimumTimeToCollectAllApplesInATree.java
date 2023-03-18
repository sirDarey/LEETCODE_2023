package January;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 11: 1443 - Minimum Time to Collect All Apples in a Tree
 */

public class _11_1443_MinimumTimeToCollectAllApplesInATree {
    
	Map <Integer, List<Integer>> map = new HashMap<>();

    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        if (n == 1)
            return 0;
            
        for (int i=0; i<n-1; i++) {
            if (!map.containsKey(edges[i][0]))
                map.put(edges[i][0], new ArrayList<>());
            map.get(edges[i][0]).add(edges[i][1]);

            if (!map.containsKey(edges[i][1]))
                map.put(edges[i][1], new ArrayList<>());
            map.get(edges[i][1]).add(edges[i][0]);    
        }

        return dfs(0, -1, hasApple);
    }

    int dfs (int node, int parent, List<Boolean> hasApple)  {
        int time = 0;

        for (int child : map.get(node)) {
            if (child != parent) {
                int tempTime = dfs(child, node, hasApple);
            
                if (tempTime > 0 || hasApple.get(child))
                    time += 2 + tempTime;
            }              
        }
        return time;
    }
}
