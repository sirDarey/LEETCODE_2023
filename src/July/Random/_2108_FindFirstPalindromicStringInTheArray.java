package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2108 - Find First Palindromic String in the Array
*/

public class _2108_FindFirstPalindromicStringInTheArray {
	
	public String firstPalindrome(String[] words) {
        for (String word : words) 
            if (isPalindrome(word))
                return word;
        return "";
    }

    boolean isPalindrome(String word){
        int l=0, r=word.length()-1;
        while (l <= r) {
            if (word.charAt(l) != word.charAt(r))
                return false;
            l++; r--;
        }
        return true;
    }
}
