package June;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 9: Problem 744 - Find Smallest Letter Greater Than Target
 * 
 */

public class _9_744_FindSmallestLetterGreaterThanTarget {
	
	public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length-1, mid = 0;
        int diff = target - 'a';

        while (left <= right) {
            mid = left + (right - left)/2;
            
            int diff2 = letters[mid] - 'a';
            if (diff2 > diff)
                right = mid - 1;
            else
                left = mid + 1; 
        }

        return (left == letters.length)? letters[0] : letters[left];
    }
}
