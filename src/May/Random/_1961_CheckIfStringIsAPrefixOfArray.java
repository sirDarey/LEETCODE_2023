package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1961 - Check If String Is a Prefix of Array
*/

public class _1961_CheckIfStringIsAPrefixOfArray {
	
	public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        int m = s.length(), n = words.length;
        for (int i=0; i<n; i++) {
            sb.append(words[i]);
            if (s.equals(sb.toString()))
                return true;
            if (sb.length() > m)
                return false;
        }
        return false;
    }
}
