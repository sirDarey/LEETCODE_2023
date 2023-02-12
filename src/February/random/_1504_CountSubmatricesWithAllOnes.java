package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 1504 - Count Submatrices With All Ones
*/

public class _1504_CountSubmatricesWithAllOnes {
	
	public int numSubmat(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for (int i=1; i<m; i++) {
            for(int j=0; j<n; j++) {
                if (mat[i][j] == 1)
                    mat[i][j] += mat[i-1][j];
            }            
        }

        int count = 0;
        for (int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                
                if (mat[i][j] >0) {
                    int temp = mat[i][j];
                    
                    for (int r = j+1; r<n; r++) {
                        if (mat[i][r] > 0) {
                            temp = Math.min(mat[i][r], temp);
                            mat[i][j] += temp;
                        } else 
                            break;
                    }

                }
                count += mat[i][j];                  
            }            
        }
        return count;
    }
}
