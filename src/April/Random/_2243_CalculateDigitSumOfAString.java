package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2243 - Calculate Digit Sum of a String

*/

public class _2243_CalculateDigitSumOfAString {
	
	public String digitSum(String s, int k) {
        int n = s.length(), i;
        
        while (n > k) {
            StringBuilder sb = new StringBuilder();
            i = 0;
            while(i < n) {
                int j = i+k;
                int tempSum = 0;

                while (i < j && i < n) {
                    tempSum += s.charAt(i) - '0';
                    i++;
                }
                sb.append(String.valueOf(tempSum));
            }
            s = sb.toString();
            n = s.length();
        }
        return s;
    }
}
