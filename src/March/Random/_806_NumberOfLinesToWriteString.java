package March.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 806 - Number of Lines To Write String
*/

public class _806_NumberOfLinesToWriteString {
	
	public int[] numberOfLines(int[] widths, String s) {
        int currentSum = 0;
        int [] result = new int[2];
        result[0] = 1;

        for (char c : s.toCharArray()) {
            if (currentSum + widths[c - 'a'] <= 100)
                currentSum += widths[c - 'a'];
            else {
                result[0] ++;
                currentSum = widths[c-'a'];
            }
        }

        result[1] = currentSum;
        
        return result;
    }
}
