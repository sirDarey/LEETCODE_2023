package January;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 23: 997 - Find the Town Judge
 */

public class _23_997_FindTheTownJudge {
    
	public int findJudge(int n, int[][] trust) {
        int m = trust.length;

        if (m == 0 && n == 1) 
            return 1;
    
        int [] count = new int [n+1];
        for (int i=0; i<m; i++) {
            count[trust[i][0]] --;
            count[trust[i][1]] ++;
        }

        for (int i=1; i<= n; i++) {
            if (count[i] == n-1)
                return i;
        }
        return -1;
    }
}
