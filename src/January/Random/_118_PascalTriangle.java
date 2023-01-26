package January.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*
* @Sir Darey
* 
* LeetCode Problem 118 - Pascal Triangle
*/

public class _118_PascalTriangle {
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(Arrays.asList(1)));

        for (int i=1; i<numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            for (int j=2; j<=i; j++) {
                int addIndex = result.size()-1;
                temp.add(result.get(addIndex).get(j-2) + result.get(addIndex).get(j-1));
            }
            
            temp.add(1);
            
            result.add(temp);
        }
        return result;
    }
}
