package May;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 10: Problem 59 - Spiral Matrix 2
*/

public class _10_59_SpiralMatrix2 {
	
	public int[][] generateMatrix(int n) {
        int status = 1, total = n*n, index = 1;
        int [][] result = new int [n][n];
        int l = 0, r = n-1, u = 0, d = n-1;

        while(index <= total) {
            switch(status) {
                case 1 -> {
                    for (int j=l; j<=r; j++) {
                        result[u][j] = index;
                        index ++;
                    }
                    u++;
                    status = 2;
                    break;
                }
                case 2 -> {
                    for (int i=u; i<=d; i++) {
                        result[i][r] = index;
                        index ++;
                    }
                    r--;
                    status = 3;
                    break;
                }
                case 3 -> {
                    for (int j=r; j>=l; j--) {
                        result[d][j] = index;
                        index++;
                    }                        
                    d--;
                    status = 4 ;
                    break;
                }
                default -> {
                    for (int i=d; i>=u; i--) {
                        result[i][l] = index;
                        index ++;
                    }
                    l++;
                    status = 1;
                }
            }
        }
        return result;
    }
}
