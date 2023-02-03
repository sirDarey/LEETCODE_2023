package February;

/**
*
 @Sir Darey
 * 
 * LeetCode Daily Challenge, February 2023
 * Day 3: Problem 6 - Zigzag Conversion
*/

public class _3_6_ZigzagConversion {
	
	public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        int jump = 2*(numRows-1);
        String result = "";

        for (int row=0; row<numRows; row++) {

            for (int i=row; i<s.length(); i+=jump) {
                result += s.charAt(i);

                if (row > 0 && row < numRows-1 && i+jump-(2*row) < s.length())
                    result += s.charAt(i+jump-(2*row));
            }
        }
        return result;
    }
}
