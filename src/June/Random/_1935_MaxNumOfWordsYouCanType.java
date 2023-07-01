package June.Random;

import java.util.HashSet;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1935 - Maximum Number of Words You Can Type
* 
*/

public class _1935_MaxNumOfWordsYouCanType {
	
	public int canBeTypedWords(String text, String brokenLetters) {
        Set <Character> set = new HashSet<>();
        for (char c : brokenLetters.toCharArray())
            set.add(c);

        String [] words = text.split(" ");
        int result = words.length;
        if (set.isEmpty())
            return result;

        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (set.contains(c)) {
                    result--;
                    break;
                }
            }
        }

        return result;
    }
}
