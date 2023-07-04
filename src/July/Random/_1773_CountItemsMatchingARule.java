package July.Random;

import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1773 - Count Items Matching a Rule
*/

public class _1773_CountItemsMatchingARule {
	
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if (ruleKey.equals("color"))
            index = 1;
        else if (ruleKey.equals("name"))
            index = 2;
        
        int count = 0;
        for (List<String> item : items)
            if (item.get(index).equals(ruleValue))
                count++;

        return count;
    }
}
