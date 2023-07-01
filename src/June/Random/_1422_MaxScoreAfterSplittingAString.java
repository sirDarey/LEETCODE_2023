package June.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1422 - Maximum Score After Splitting a String
* 
*/

public class _1422_MaxScoreAfterSplittingAString {
	
	public int maxScore(String s) {
        int zeros = 0, ones = 0, score = -1;

        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == '0')
                zeros++;
            else
                ones++;
            score = Math.max(score, zeros - ones);
        }

        if (s.charAt(s.length()-1) == '0')
            zeros++;
        else
            ones++;

        return score + ones;
    }
}
