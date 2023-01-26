package January.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*
* @Sir Darey
* 
* LeetCode Problem 119 - Pascal Triangle2
*/

public class _119_PascalTriangle2 {
	
	public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>(Arrays.asList(1));

        for (int i=1; i<=rowIndex; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);

            for (int j=2; j<=i; j++) {
                current.add(prev.get(j-2) + prev.get(j-1));
            }

            current.add(1);
            prev = current;
        }
        return prev;
    }
}
