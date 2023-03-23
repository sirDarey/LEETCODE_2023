package March;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 23: Problem 1319 - Number of Operations to Make Network Connected
* 
*/


public class _23_1319_NumberOfOperationsToMakeNetworkConnected {
	
	public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;
        
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new HashSet<>());
        for (int[] connection : connections) {
            int u = connection[0], v = connection[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        boolean [] visited = new boolean[n];
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(i, graph, visited);
            }
        }
        
        return components - 1;
    }
    
    void dfs(int node, List<Set<Integer>> graph, boolean[] visited) {
        if (visited[node]) 
            return;

        visited[node] = true;
        for (int neighbor : graph.get(node)) 
            dfs(neighbor, graph, visited);
    }
}
