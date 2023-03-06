package March.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2185 - Counting Words With A Given Prefix
*/

public class _2185_CountingWordsWithAGivenPrefix {
	
	public int prefixCount(String[] words, String pref) {
        int result = 0;
        for (String word : words)
            if (word.startsWith(pref))
                result++;
        return result;
    }
}
