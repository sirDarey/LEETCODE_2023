package January;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 2: Problem 520 - Detect Capital
 */

public class _2_520_DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;

        int firstChar = word.charAt(0);
        int i = 1;

        if(firstChar - 'a' >= 0 || (firstChar - 'a' < 0 && word.charAt(1) - 'a' >= 0))  {
            
            while (i < word.length()) {
                if(word.charAt(i) - 'a' < 0)
                    return false;
                i++;
            }
            return true;
        } else {
            ++i;
            while (i < word.length()) {
                if(word.charAt(i) - 'a' >= 0)
                    return false;
                i++;
            }
            return true;
        }
    }
}
