package June;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 5: Problem 1232 - Check If It Is a Straight Line
 * 
 */

public class _5_1232_CheckIfItIsAStraightLine {
	
	public boolean checkStraightLine(int[][] c) {
        int [] c1 = c[0], c2 = c[1];
        
        //(y2 - y1) / (x2 - x1) = (yi- yi-1)/ (xi - xi-1) 

        for (int i=2; i<c.length; i++) {
           int [] ci = c[i];
           if ((c2[1] - c1[1])*(ci[0] - c1[0]) != (c2[0] - c1[0])*(ci[1] - c1[1])) 
                return false;
        }

        return true;
    }
}
