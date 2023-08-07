package August.Random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 389 - Find the Difference
* 
*/

public class _389_FindTheDifference {
	
	public char findTheDifference(String s, String t) {
        int [] map = new int [26];
        for (char c : s.toCharArray())
            map[c-'a']++;
        for (char c : t.toCharArray()) 
            if (--map[c-'a'] < 0)
                return c;
        
        return '0';
    }
}
