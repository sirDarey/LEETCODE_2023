package February.random;

import java.util.List;

/**
*
* @Sir Darey
* 
* LeetCode Problem 120 - Triangle
*/

public class _120_Triangle {
	
	public int minimumTotal(List<List<Integer>> triangle) {
        
        for (int i=triangle.size()-2; i>=0; i--) {
            for (int j=0; j<=i; j++) 
                triangle.get(i).set(j, triangle.get(i).get(j) +
                Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            
        }
        return triangle.get(0).get(0);
    }
}
