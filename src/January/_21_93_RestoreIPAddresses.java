package January;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 21: 93 - Restore IP Addresses
 */

public class _21_93_RestoreIPAddresses {
    
	List<String> result = new ArrayList<>();
    String s; int n;
    
    public List<String> restoreIpAddresses(String s) {
        n = s.length();
        if (n > 12)
            return result;
        
        this.s = s;
        backtrack(0, 0, "");
        return result;
    }

    void backtrack(int i, int dots, String ipSoFar) {
        if (dots == 4 && i == n) {
            result.add(ipSoFar.substring(0, ipSoFar.length()-1));
            return;
        }
        if (dots > 4) 
            return;

        for (int j=i; j< Math.min(i+3, n); j++) {
            if (Integer.parseInt(s.substring(i, j+1)) < 256 && (i==j || s.charAt(i) != '0'))
                backtrack(j+1, dots+1, ipSoFar + s.substring(i, j+1) + ".");
        }
    }
}
