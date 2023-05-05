package May;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 5: Problem 1456 - Maximum Number of Vowels in a Substring of Given Length
*/

public class _5_1456_MaxNumOfVowelsInASubOfGivenLength {
	public int maxVowels(String s, int k) {
        int n = s.length(), max = 0, i = 0, current;
        Set<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        //to find the 1st vowel
        while (i<n && !vowel.contains(s.charAt(i)))
            i++;
        int j = 0;
        while (i<n && j<k) {
            if (vowel.contains(s.charAt(i)))
                max++;
            i++; j++;
        }
        current = max;
        while (i<n) {
            current += vowel.contains(s.charAt(i))? 1 : 0; 
            current -= vowel.contains(s.charAt(i-k))? 1 : 0;
            max = Math.max(current, max);
            i++;
        } 
        return max;
    }
}
