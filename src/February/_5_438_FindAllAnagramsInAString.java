package February;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*
 @Sir Darey
 * 
 * LeetCode Daily Challenge, February 2023
 * Day 5: Problem 438 - Find All Anagrams In A String
*/

public class _5_438_FindAllAnagramsInAString {
	
	public List<Integer> findAnagrams(String s, String p) {
        int i = 0, j = 0, n = p.length();
        int [] map = new int [26];

        for (char c : p.toCharArray())
            map[c - 'a']++;
        
        int [] temp = new int [26];
        List <Integer> result = new ArrayList<>();

        while (j < s.length()) {
            temp[s.charAt(j) - 'a']++;

            if (j - i + 1 == n) {
                if (Arrays.equals(temp, map))
                    result.add(i);
                
                temp[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }

        return result;
    }
}
