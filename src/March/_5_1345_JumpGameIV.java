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
* Day 5: Problem 1345 -  Jump Game IV
*/

public class _5_1345_JumpGameIV {
	
	public int minJumps(int[] arr) {
        Map <Integer, List<Integer>> map = new HashMap<>();
        int n = arr.length;

        for (int i=0; i<n; i++) {
            int current = arr[i];
            if (!map.containsKey(current))
                map.put(current, new ArrayList<>());
            map.get(current).add(i);
        }

        boolean [] visited = new boolean[n];
        Queue <Integer> queue = new LinkedList<>();
        queue.add(0);
        int steps = 0;

        while (!queue.isEmpty()) {
            int index;
            List<Integer> adj = new ArrayList<>();

            while (!queue.isEmpty()) {
                index = queue.poll();
                if (index == n-1)
                    return steps; 
                
                if (index-1 >= 0 && !visited[index-1])  {
                    adj.add(index-1);
                    visited[index-1] = true;
                } 

                if (index+1 < n && !visited[index+1])  {
                    adj.add(index+1);
                    visited[index+1] = true;
                } 

                map.get(arr[index]).forEach(x -> {
                    if (!visited[x])  {
                        adj.add(x);
                        visited[x] = true;
                    }
                });
                map.get(arr[index]).clear();           
            }  
            queue.addAll(adj);
            steps++;           
        }
        return steps;
    }
}
