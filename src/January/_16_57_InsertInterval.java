package January;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 16 : 57 - Insert Interval
 */

public class _16_57_InsertInterval {
    
	 public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        List<int[]> temp = new ArrayList<>();

        for (int i=0; i<n; i++) {
            if (newInterval[1] < intervals[i][0]) {
                temp.add(newInterval);

                while (i < n) {
                    temp.add(intervals[i]);
                    i++;
                }
                
                return temp.toArray(new int [temp.size()][2]);

            } else if (newInterval[0] > intervals[i][1])
                temp.add(intervals[i]);
            else
                newInterval = new int [] {Math.min(newInterval[0], intervals[i][0]),
                                            Math.max(newInterval[1], intervals[i][1])};
        }

        temp.add(newInterval);
        return temp.toArray(new int [temp.size()][2]);
    }
}
