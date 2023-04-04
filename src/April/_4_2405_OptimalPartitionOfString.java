package April;

import java.util.HashSet;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 4: Problem 2405 - Optimal Partition of String
*/

public class _4_2405_OptimalPartitionOfString {
	public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int result = 1;

        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                result++;
                set.clear();
                set.add(c);
            }
        }
        return result;
    }
}
