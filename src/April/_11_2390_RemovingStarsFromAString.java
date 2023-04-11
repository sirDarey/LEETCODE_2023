package April;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 11: Problem 2390 - Removing Stars From a String
*/

public class _11_2390_RemovingStarsFromAString {
	public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int n = -1;
        for (char c : s.toCharArray()) {
            if (c == '*' && n > -1) {
                sb.deleteCharAt(n);
                n--;
            } else {
                sb.append(c);
                n++;
            }            
        }
        return sb.toString();
    }
}
