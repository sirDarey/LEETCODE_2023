package January;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 4: Problem 2244 - Minimum Rounds to Complete All Tasks
 */

public class _4_2244_MinRoundsToCompleteAllTasks {
    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);
        Map <Integer, Integer> map = new HashMap<>();
        map.put(tasks[0], 1);

        int prev = tasks[0], count = 1;

        for (int i=1; i<tasks.length; i++) {
            int current = tasks[i];

            if (current != prev) 
                count = 0;
            
            count ++;
            map.put(current, count);
            prev = current;
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return -1;
            result += Math.ceil(entry.getValue()/3.0);
        }
        
        return result;
    }
}
