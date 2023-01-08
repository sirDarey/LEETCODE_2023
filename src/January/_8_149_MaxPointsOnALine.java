package January;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 8: 149 - Max Points on a Line
 */

public class _8_149_MaxPointsOnALine {
    
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2)
            return n;

        int max = 0;
        double MAX = Integer.MAX_VALUE;

        for (int i=0; i<n-1; i++) {
            Map <Double, Integer> map = new HashMap<>();
            double x1 = points[i][0], y1 = points[i][1];

            for (int j=i+1; j<n; j++) {
                double x2 = points[j][0], y2 = points[j][1];
                double slope;

                if (x1 == x2)
                    slope = MAX;
                else if (y1 == y2)
                    slope = 0.0;
                else
                    slope = (y2 - y1) / (x2 - x1);
                    
                map.put(slope, map.getOrDefault(slope, 0)+1);
                max = Math.max(max, map.get(slope));
            }
        }

        return max+1;
    }
}
