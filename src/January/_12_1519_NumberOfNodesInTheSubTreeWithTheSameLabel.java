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
 * Day 12: 1519 - Number of Nodes in the Sub-Tree With the Same Label
 */

public class _12_1519_NumberOfNodesInTheSubTreeWithTheSameLabel {
    
	public int[] countSubTrees(int n, int[][] edges, String labels) {
	    
        Map <Integer, List<Integer>> adj = new HashMap <>();
        for (int i=0; i<n; i++) 
            adj.put(i, new ArrayList<>());
        for (int i=0; i<n-1; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
            
        int [] result = new int [n];
        int [] map = new int [26];

        dfs(labels, adj, result, map, 0, -1);
        return result;
    }

    void dfs (String labels, Map <Integer, List<Integer>> adj, 
                int [] result,  int [] map, int node, int parent) {

        int idx = labels.charAt(node) - 'a';
        int prevCount = map[idx];
        map[idx] ++;

        for (int child : adj.get(node)) {
            if (child != parent) {
                dfs(labels, adj, result, map, child, node);
            }
        }

        result[node] = map[idx] - prevCount;
    }
}
