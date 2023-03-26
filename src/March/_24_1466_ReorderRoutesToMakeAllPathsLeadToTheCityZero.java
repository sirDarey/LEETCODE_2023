package March;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 24: Problem 1466 - Reorder Routes to Make All Paths Lead to the City Zero
* 
*/


public class _24_1466_ReorderRoutesToMakeAllPathsLeadToTheCityZero {
	
	public int minReorder(int n, int[][] connections) {
        List <Set<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++)
            adj.add(new HashSet<>());

        for(int i=0; i<connections.length; i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(-connections[i][0]);
        }
         
        boolean visited [] = new boolean[n];
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;

        while(!queue.isEmpty()){
            int current = queue.poll();
            for(int neighbor : adj.get(Math.abs(current))){
                if(!visited[Math.abs(neighbor)]){
                    queue.add(neighbor);
                    visited[Math.abs(neighbor)] = true;
                    
                    if(neighbor > 0)
                        result++;
                }
            }
        }
        return result;
    }
}
