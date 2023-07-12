package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2264 - Largest 3-Same-Digit Number in String
*/

public class _2264_Largest3SameDigitNumInString {
	
	public String largestGoodInteger(String num) {
        int max = -1;
        for (int i=2; i<num.length(); i++) {
            if (num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i-2)) {
                max = Math.max(max, Integer.parseInt(num.substring(i-2, i+1)));
            }
        }
        if (max > 0)
            return String.valueOf(max);
        else if (max == 0)
            return "000";
        else
            return "";
    }
}
