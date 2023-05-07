package May.Random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 187 - Repeated DNA Sequences
*/

public class _12_IntegerToRoman {
	
	public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();
        int n = s.length();
        if (n < 10)
            return new ArrayList<>(); 
        
        int i = 0, j = 10;
        
        while (j <= n) {
            if (!set.add(s.substring(i, j)))
                result.add(s.substring(i, j));
            i++; j++;
        }

        return new ArrayList<>(result);
    }
}
