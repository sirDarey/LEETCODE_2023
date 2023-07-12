package July.Random;

import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1002 - Find Common Characters
* 
*/

public class _1002_Find_Common_Characters {
	
	public List<String> commonChars(String[] words) {
		
        char [] alp = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
        'p','q','r','s','t','u','v','w','x','y','z'};
        int n = words.length;
        int [][] map = new int [n][26];

        for (int i=0; i<n; i++) {
            String word = words[i];
            for (char c : word.toCharArray()) {
                map[i][c-'a']++;                
            }
        }

        List<String> result = new ArrayList<>();
        for (int i=0; i<26; i++) {
            int count = 100;
            for (int [] current : map) {
                count = Math.min(count, current[i]);
                if (count == 0)
                    break;                    
            }
            while (count-- > 0)
                result.add(String.valueOf(alp[i]));
        }

        return result;
    }
}
