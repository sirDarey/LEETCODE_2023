package May.Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1604 - Alert Using Same Key-Card Three or More Times in a One Hour Period
*/

public class _1604_AlertUsingSameKeyCard3OrMoreTimesInA1HourPeriod {
	
	public List<String> alertNames(String[] keyName, String[] keyTime) {
        Map<String, Set<Integer>> map = new HashMap<>();

        for (int i=0; i<keyName.length; i++) {
            int currentTime = getTime(keyTime[i]);
            map.computeIfAbsent(keyName[i], s -> new TreeSet<>()).add(currentTime);
        }

        Set <String> result = new TreeSet<>();
        for (Map.Entry<String, Set<Integer>> entry : map.entrySet()) {
            List <Integer> list = new ArrayList<>(entry.getValue());
            for (int i=2; i<list.size(); i++){
                if (list.get(i) - list.get(i - 2) <= 100) {
                    result.add(entry.getKey());
                    break;
                }
            }
        }

        return new ArrayList<>(result);
    }

    int getTime (String keyTime) {
        StringBuilder sb = new StringBuilder(keyTime);
        sb.deleteCharAt(2);
        return Integer.parseInt(sb.toString());
    }
}
