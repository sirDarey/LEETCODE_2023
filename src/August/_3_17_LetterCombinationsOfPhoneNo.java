package August;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, August 2023
* Day 3: Problem 17 - Letter Combinations of a Phone Number
* 
*/

public class _3_17_LetterCombinationsOfPhoneNo {
	public List<String> letterCombinations(String digits) {
        int n = digits.length();
        List<String> result = new ArrayList<>();
        if (n == 0)
            return result;
        Map <Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        combine(map, n, 0, result, new StringBuilder(), digits);

        return result;
    }

    void combine(Map <Character, String> map, int n, int i, List<String> result, StringBuilder sb, String digits) {
        if (i == n) {
            result.add(sb.toString());
            return;
        }
        
        for (char c : map.get(digits.charAt(i)).toCharArray()) {
            sb.append(c);
            combine(map, n, i+1, result, sb, digits);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}
