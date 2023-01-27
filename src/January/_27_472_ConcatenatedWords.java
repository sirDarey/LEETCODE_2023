package January;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 27: 472 - Concatenated Words
 */

public class _27_472_ConcatenatedWords {
    
	public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set <String> set = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        
        for (String word : words)
            if (recur (word, set))
                result.add(word);
        
        return result;
    }

    boolean recur(String word, Set <String> set) {
        for (int i=1; i<word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i, word.length());

            if ( set.contains(prefix) && (set.contains(suffix) || recur(suffix, set)) )
                return true;
        }
        return false;
    }
}
