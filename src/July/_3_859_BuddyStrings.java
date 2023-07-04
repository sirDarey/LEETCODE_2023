package July;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, July 2023
 * Day 3: Problem 859 - Buddy Strings
 */

public class _3_859_BuddyStrings {
	
	public boolean buddyStrings(String s, String goal) {
        int m = s.length(), n = goal.length();
        if (m != n)
            return false;

        if (s.equals(goal)) {
            Set <Character> set = new HashSet<>();
            for (char ch : s.toCharArray())
                if (!set.add(ch))
                    return true;
            return false;
        }
            
        StringBuilder sb = new StringBuilder(s);
        int flag = 0;
        int i1 = 0, i2 = 0;

        for (int i=0; i<m; i++) {
            if (s.charAt(i) != goal.charAt(i)) { 
                if(flag == 0)
                    i1 = i;
                else
                    i2 = i;
                flag++;
            }
            if (flag == 2){
                sb.setCharAt(i1, s.charAt(i2));
                sb.setCharAt(i2, s.charAt(i1));
                
                return sb.toString().equals(goal);
            }              
        }

        return false;
    }
}
