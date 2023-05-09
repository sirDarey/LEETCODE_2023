package May;

import java.util.ArrayList;
import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 9: Problem 54 - Spiral Matrix
*/

public class _9_54_SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length, total = m * n, status = 1;
        List <Integer> result = new ArrayList<>();
        int l = 0, r = n-1, u = 0, d = m-1;

        while(result.size() < total) {
            switch(status) {
                case 1 -> {
                    for (int j=l; j<=r; j++)
                        result.add(matrix[u][j]);
                    u++;
                    status = 2;
                    break;
                }
                case 2 -> {
                    for (int i=u; i<=d; i++)
                        result.add(matrix[i][r]);
                    r--;
                    status = 3;
                    break;
                }
                case 3 -> {
                    for (int j=r; j>=l; j--)
                        result.add(matrix[d][j]);
                    d--;
                    status = 4 ;
                    break;
                }
                default -> {
                    for (int i=d; i>=u; i--)
                        result.add(matrix[i][l]);
                    l++;
                    status = 1;
                }
            }
        }
        return result;
    }
}
