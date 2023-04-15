package April.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 500 - Keyboard Row
*/

public class _500_KeyboardRow {
	
	public String[] findWords(String[] words) {
        Set<Character> 
            set1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p')),
            set2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l')),
            set3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));
        
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String wordT = word.toLowerCase();
            int n = wordT.length();
            char firstChar = wordT.charAt(0);
            Set<Character> temp;
            if (set1.contains(firstChar))
                temp = set1;
            else if (set2.contains(firstChar))
                temp = set2;
            else 
                temp = set3;
            int i = 0;
            for (i=0; i<n; i++) {
                if (!temp.contains(wordT.charAt(i)))
                    break;
            }
            if (i == n)
                result.add(word);
        }
        return result.toArray(new String[result.size()]);
    }
}
