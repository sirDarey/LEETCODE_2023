package January.Random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 392 - Is Subsequence
*/

public class _392_IsSubsequence {
	
	public boolean isSubsequence(String s, String t) {
        int m = s.length(), n = t.length();
        if (m > n)
            return false;

        int i = 0, j = 0;
        while(i < m && j < n) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        } 
        return (i == m);
    }
}
