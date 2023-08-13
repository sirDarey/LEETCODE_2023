package August.Random;

import java.util.HashSet;
import java.util.Set;

/**
*
* @Sir Darey
* 
* LeetCode Problem 2062 - Count Vowel Substrings of a String
*/

public class _2062_CountVowelSubstringsOfAString {
	
	public int countVowelSubstrings(String word) {
        int n = word.length();
        if (n < 5)
            return 0;

        int result = 0;
        for (int i=0; i<=n-5; i++) {
            Set <Character> set = new HashSet<>();

            for (int j=i; j<n; j++) {
                char c = word.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
                    set.add(c);
                else 
                    break;
                if (set.size() == 5)
                    result++;
            }
            
        }
        return result;
    }
}
