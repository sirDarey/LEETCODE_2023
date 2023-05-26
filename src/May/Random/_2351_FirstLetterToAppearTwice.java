package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2351 - First Letter to Appear Twice
* 
*/

public class _2351_FirstLetterToAppearTwice {
	
	public char repeatedCharacter(String s) {
        int [] arr = new int [26];
        for (char c : s.toCharArray()){
            arr[c-'a']++;
            if (arr[c-'a'] == 2)
                return c;
        }
        return 'a';
    }
}
