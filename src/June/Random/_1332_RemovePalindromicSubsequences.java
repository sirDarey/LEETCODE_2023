package June.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1332 - Remove Palindromic Subsequences
*/

public class _1332_RemovePalindromicSubsequences {
	
	public int removePalindromeSub(String s) {
        int result = 1, i = 0, j = s.length() - 1; 

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j))
                break;
            i++; j--;
        }

        return (i >= j)? result : ++result;
    }
}
