package February;

/**
*
 @Sir Darey
 * 
 * LeetCode Daily Challenge, February 2023
 * Day 1: Problem 1071 - Greatest Common Divisor of Strings 
*/

public class _1_1071_GreatestCommonDivisorOfStrings {
	
	public int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }    
    }
    
    public String gcdOfStrings(String str1, String str2) {
        // Check if they have non-zero GCD string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Get the GCD of the two lengths.
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
}
