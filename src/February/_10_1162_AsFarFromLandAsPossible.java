package February;

import java.util.LinkedList;
import java.util.Queue;

/**
*
* @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 10: Problem 1162 - As Far From Land As Possible
*/

public class _10_1162_AsFarFromLandAsPossible {
	
	public int maxDistance(int[][] grid) {
        int n = grid.length;
        Queue<int []> queue = new LinkedList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == 1)
                    queue.offer(new int [] {i, j});
            }
        }

        int [][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int result = 1;

        while (!queue.isEmpty()) {
            int [] current = queue.poll();
            result = grid[current[0]][current[1]];

            for (int [] dir : dirs) {
                int newRow = current[0]+dir[0];
                int newCol = current[1]+dir[1];

                if (Math.min(newRow, newCol) >= 0 &&
                    Math.max(newRow, newCol) < n &&
                    grid[newRow][newCol] == 0) {

                        grid[newRow][newCol] = result + 1;
                        queue.offer(new int[] {newRow, newCol});
                }
            }
        }

        return result > 1? result-1 : -1;
    }
}
