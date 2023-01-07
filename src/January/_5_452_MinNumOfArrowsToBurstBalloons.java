package January;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 5: 452 - Minimum Number of Arrows to Burst Balloons
 */

public class _5_452_MinNumOfArrowsToBurstBalloons {
    
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        boolean [] visited = new boolean [n];
        int result = 0;
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                result ++;
                int L = points[i][0], R = points[i][1];

                for (int j=i; j<n; j++) {
                        L = Math.min(L, points[j][0]);
                        R = Math.min(R, points[j][1]);
                    if (!visited[j] && points[j][0] >= L && points[j][0] <= R && points[j][1] >= R) {
                        visited[j] = true;
                    } else
                        break;
                }
            }            
        }

        return result;
    }
}
