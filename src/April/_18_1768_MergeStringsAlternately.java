package April;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 18: Problem 1768 - Merge Strings Alternately
*/

public class _18_1768_MergeStringsAlternately {
	public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i<Math.min(m, n)) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        while (i<m) {
            sb.append(word1.charAt(i));
            i++;
        }
        while (i<n) {
            sb.append(word2.charAt(i));
            i++;
        }
        return sb.toString();
    }
}
