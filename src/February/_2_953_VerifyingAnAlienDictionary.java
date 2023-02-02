package February;

import java.util.HashMap;
import java.util.Map;

/**
*
 @Sir Darey
 * 
 * LeetCode Daily Challenge, February 2023
 * Day 2: Problem 953 - Verifying An Alien Dictionary
*/

public class _2_953_VerifyingAnAlienDictionary {
	
	public boolean isAlienSorted(String[] words, String order) {
        Map <Character, Integer> map = new HashMap<>();
        for (int i=0; i<order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        for (int i=0; i<words.length-1; i++) {
            String current = words[i];
            int m = current.length();

            for (int j=i+1; j<words.length; j++) {
                String temp = words[j];
                int n = temp.length();
                int k = 0, min = Math.min(m, n);
                
                while (k < min) {
                    if (map.get(current.charAt(k)) < map.get(temp.charAt(k)))
                        break;
                    else if (map.get(current.charAt(k)) > map.get(temp.charAt(k)))
                        return false;
                    else 
                        k++;
                }
                if (k == n && m > n)
                    return false;

            }
        }
        
        return true;
    }
}
