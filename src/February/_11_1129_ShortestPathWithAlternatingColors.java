package February;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
*
* @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 11: Problem 1129 - Shortest Path with Alternating Colors
*/

public class _11_1129_ShortestPathWithAlternatingColors {
	
	public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        Map <Integer, List<Integer>> redGraph = new HashMap<>(),
                                     blueGraph = new HashMap<>();

        for (int i=0; i<redEdges.length; i++) {
            if (!redGraph.containsKey(redEdges[i][0])) 
                redGraph.put(redEdges[i][0], new ArrayList<>());
            redGraph.get(redEdges[i][0]).add(redEdges[i][1]);
        }
        
        for (int i=0; i<blueEdges.length; i++) {
            if (!blueGraph.containsKey(blueEdges[i][0])) 
                blueGraph.put(blueEdges[i][0], new ArrayList<>());
            blueGraph.get(blueEdges[i][0]).add(blueEdges[i][1]);
        }
        
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int []{0, 0, -1});
        int [] result = new int [n];
        Arrays.fill(result, -1);
        Set <List<Integer>> visit = new HashSet<>();
        visit.add(Arrays.asList(0, -1));

        while (!queue.isEmpty()) {
            int [] current = queue.poll();
            int node = current[0], length = current[1], colour = current[2];

            if (result[node] == -1)
                result[node] = length;
            
            if (colour != 0 && redGraph.containsKey(node)) { // 0 for RED
                for (int adj : redGraph.get(node)) {
                    if (!visit.contains(Arrays.asList(adj, 0))) {
                        visit.add(Arrays.asList(adj, 0));
                        queue.offer(new int []{adj, length+1, 0});
                    }
                }
            }

            if (colour != 1 && blueGraph.containsKey(node)) { // 1 for BLUE
                for (int adj : blueGraph.get(node)) {
                    if (!visit.contains(Arrays.asList(adj, 1))) {
                        visit.add(Arrays.asList(adj, 1));
                        queue.offer(new int []{adj, length+1, 1});
                    }
                }
            }
        }
        return result;
    }
}
