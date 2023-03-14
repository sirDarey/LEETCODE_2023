package March.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1758 - Minimum Changes To Make Alternating Binary String
*/

public class _1758_MinChangesToMakeAlternatingBinaryString {
	
	public int minOperations(String s) {
	        int startOne = 0, startZero = 0;
	        char c1 = '1', c2 = '0';
	
	        for (char c : s.toCharArray()) {
	            startOne += (c1 == c)? 0 : 1;
	            startZero += (c2 == c)? 0 : 1;
	            char temp = c1;
	            c1 = c2;
	            c2 = temp;
	        }
	        return Math.min(startOne, startZero);
    }
}
