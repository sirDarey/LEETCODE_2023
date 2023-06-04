package June.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 58 - Length of Last Word
* 
*/

public class _58_LengthOfLastWord {
	
	public int lengthOfLastWord(String s) {
        String s2 = s.trim();
        int i = s2.length()-1;
        while (i>=0 && s2.charAt(i) != ' ') 
            i--;
        return(s2.length()-1-i);
    }
}
