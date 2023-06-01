package June;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 1: Problem 1091 - Shortest Path in Binary Matrix
 */

public class _1_1091_ShortestPathInBinaryMatrix {
	
	public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1)
            return -1;

        Queue<int []> q = new LinkedList<>();
        // i, j, count
        q.offer(new int []{0, 0, 1});
        int [] current = new int [2];

        int [][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        while (!q.isEmpty()) {
            current = q.poll();
            int a = current[0], b = current[1], p = current[2];
            if(a == n-1 && b == n-1)
                break;

            for (int [] dir : dirs) {
                int i = a+dir[0], j = b+dir[1];
                if(i>=0 && i<n && j>=0 && j<n && grid[i][j] == 0) {
                    q.offer(new int []{i, j, p+1});
                    grid[i][j] = 1;
                }
            }
        }
        if(current[0] == n-1 && current[1] == n-1)
            return current[2];
        else
            return -1;
    }
}
