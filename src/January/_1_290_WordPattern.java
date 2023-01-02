package January;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 1: Problem 290 - Word Pattern
 */

public class _1_290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String [] sArray = s.split(" ");
        int n = sArray.length;

        if (pattern.length() == n) {
            Map <Character, String> map = new HashMap<>();
            Set <String> set = new HashSet<>();
            for (int i=0; i<n; i++) {
                char current = pattern.charAt(i);
                if (map.containsKey(current)) {
                    if (!map.get(current).equals(sArray[i]))
                        return false;
                } else {
                    if (set.add(sArray[i]))
                        map.put(current, sArray[i]);
                    else
                        return false;
                }
            }
            return true;
        }
        return false;       
    }
}
