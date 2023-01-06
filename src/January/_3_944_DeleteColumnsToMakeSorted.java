package January;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 3: Problem 944 - Delete Columns to Make Sorted
 */

public class _3_944_DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int rows = strs.length, cols = strs[0].length();
        int result = 0;

        for (int i=0; i<cols; i++) {
            char temp = strs[0].charAt(i);
            for (int j=1; j<rows; j++) {
                if (temp - strs[j].charAt(i) > 0) {
                    result ++;
                    break;
                }
                temp = strs[j].charAt(i);
            }
        }
        return result;
    }
}
