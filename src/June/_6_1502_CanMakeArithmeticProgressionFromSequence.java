package June;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 6: Problem 1502 -  Can Make Arithmetic Progression From Sequence
 * 
 */

public class _6_1502_CanMakeArithmeticProgressionFromSequence {
	
	public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = arr[1] - arr[0];

        for (int i=2; i<arr.length; i++)
            if(arr[i] - arr[i-1] != d)
                return false;
        return true;
    }
}
