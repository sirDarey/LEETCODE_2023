package January;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 17: 926 - Flip String to Monotone Increasing
 */

public class _17_926_FlipStringToMonotoneIncreasing {
    
	public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int min = 0, count1 = 0;
        int i = 0;
        while (i<n && s.charAt(i) == '0')
            i++;
        
        for (int j=i; j<n; j++) {
            if (s.charAt(j) == '1') {
                count1++;
                continue;
            }

            min = Math.min(1+min, count1);
        }
        return min;
    }
}
