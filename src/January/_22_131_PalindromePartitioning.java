package January;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 22: 131 - Palindrome Partitioning
 */

public class _22_131_PalindromePartitioning {
    
	List<List<String>> result = new ArrayList<>();
    List<String> part = new ArrayList<>();
    String s; 
    int n;
        
    public List<List<String>> partition(String s) {
        this.s = s;
        n = s.length();
        recur(0);
        return result;
    }
    
    void recur (int i) {
        if (i == n) {
            result.add(new ArrayList<>(part));
            return;
        }
        
        for (int j=i+1; j<=n; j++) {
            if (isPalindrome (i, j-1)) {
                part.add(s.substring(i, j));
                recur(j);
                part.remove(part.size()-1);
            }
        }
    }
    
    boolean isPalindrome(int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}
