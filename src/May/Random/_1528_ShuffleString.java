package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1528 - Shuffle String
*
*/

public class _1528_ShuffleString {
	
	public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for (int i=0; i<indices.length; i++)
            sb.setCharAt(indices[i], s.charAt(i));
        return sb.toString();
    }
}