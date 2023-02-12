package February;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*
* @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 12: Problem 2477 - Minimum Fuel Cost to Report to the Capital
*/

public class _12_2477_MinimumFuelCostToReportToTheCapital {
	
	long fuel = 0; int seats;
    Map <Integer, List<Integer>> graph = new HashMap<>();

    public long minimumFuelCost(int[][] roads, int seats) {
        if (roads.length == 0)
            return 0;
        this.seats = seats;
        
        for (int i=0; i<roads.length; i++) {
            if (!graph.containsKey(roads[i][0]))
                graph.put (roads[i][0], new ArrayList<>());
            graph.get(roads[i][0]).add(roads[i][1]);

            if (!graph.containsKey(roads[i][1]))
                graph.put (roads[i][1], new ArrayList<>());
            graph.get(roads[i][1]).add(roads[i][0]);
        }
        
        dfs(0, -1);
        return fuel;
    }

    long dfs (int node, int parent) {
        long passengers = 0;
        
        for (int child : graph.get(node)) {
            if (child != parent) {
                long temp = dfs(child, node);
                fuel += (long)Math.ceil((double)temp/seats);
                passengers += temp;
            }
        }              
        return passengers+1;
    }
}
