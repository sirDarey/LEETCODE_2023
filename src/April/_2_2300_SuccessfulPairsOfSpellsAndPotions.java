package April;

import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 2: Problem 2300 - Successful Pairs of Spells and Potions
*/

public class _2_2300_SuccessfulPairsOfSpellsAndPotions {
	public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int m = spells.length, n = potions.length;
        int [] result = new int [m];

        for (int i=0; i<m; i++) {
            long spell = spells[i];
            result[i] = checkSuccess(0, n-1, spell, potions, success);
        }
        return result;
    }

    int checkSuccess (int left, int right, long spell, int[] potions, long success) {
        int mid = (left + right)/2;
        while (left <= right) {
            mid = (left + right)/2;
            long product = spell * potions[mid];
    
            if (product >= success)
                right = mid - 1;
            else 
                left = mid + 1;
        }
        return potions.length - left;
    }
}
