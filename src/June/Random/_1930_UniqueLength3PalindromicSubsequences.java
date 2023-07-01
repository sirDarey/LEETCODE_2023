package June.Random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1930 - Unique Length-3 Palindromic Subsequences
* 
*/

public class _1930_UniqueLength3PalindromicSubsequences {
	
	public int countPalindromicSubsequence(String s) {
        int result = 0, n = s.length();
        @SuppressWarnings("unchecked")
		List <Integer> map [] = new ArrayList [26];

        for (int i=0; i<n; i++) {
            if (map[s.charAt(i) - 'a'] == null)
                map[s.charAt(i) - 'a'] = new ArrayList<>();
            map[s.charAt(i) - 'a'].add(i);
        }
        
        for (int i=0; i<26; i++) {
            List <Integer> current = map[i];
            int size = (current == null) ? 0 : current.size();

            if (size > 1) {
                Set <Character> set = new HashSet<>();
                int start = current.get(0);
                int j = current.get(size - 1) - 1;

                while (j > start) {
                    if (set.add(s.charAt(j)))
                        result ++;
                    j--;
                }
            }
        }
        return result;
    }
}
