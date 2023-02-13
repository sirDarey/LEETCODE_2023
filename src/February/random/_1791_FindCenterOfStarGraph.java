package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 1791 - Find Center of Star Graph
*/

public class _1791_FindCenterOfStarGraph {
	
	public int findCenter(int[][] edges) {
        int n = edges.length;
        int [] graph = new int [n+1];
        
        for (int i=0; i<n; i++) {
            graph[edges[i][0]-1]++;            
            graph[edges[i][1]-1]++;
        }
        
        for(int i=0; i<=n; i++) {
            if (graph[i] == n)
                return i+1;
        }
        return 0;
    }
}
