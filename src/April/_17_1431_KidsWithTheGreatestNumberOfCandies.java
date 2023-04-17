package April;

import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 17: Problem 1431 - Kids With the Greatest Number of Candies
*/

public class _17_1431_KidsWithTheGreatestNumberOfCandies {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies)
            max = Math.max(max, candy);
        List <Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy+extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
