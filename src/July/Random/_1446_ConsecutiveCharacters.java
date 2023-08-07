package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1446 - Consecutive Characters
* 
*/

public class _1446_ConsecutiveCharacters {
	
	public int maxPower(String s) {
        int max = 1, n = s.length(), i = 1;

        while (i < n) {
            int count = 1;
            while (i < n && s.charAt(i) == s.charAt(i-1)) {
                count++; i++;
            }
            max = Math.max(max, count);
            i++;
        }
        return max;
    }
}
