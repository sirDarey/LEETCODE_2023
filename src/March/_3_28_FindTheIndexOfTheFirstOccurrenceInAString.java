package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 3: Problem 28 -Find The Index Of The First Occurrence In A String
*/

public class _3_28_FindTheIndexOfTheFirstOccurrenceInAString {
	
	public int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        int i = 0, j = n;
        
        while (i < m && j <= m) {
            if (haystack.substring(i, j).equals(needle))
                return i;
            i++; j++;
        }
        return -1;
    }
}
