package January.Random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
*
* @Sir Darey
* 
* LeetCode Problem 216 - Combination Sum III
*/

public class _216_CombinationSumIII {
	
	int k, n;
    List<Integer> temp = new ArrayList<>();
    Set<List<Integer>> result = new  HashSet<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        if ((k*(k+1))/2  > n)
            return new ArrayList<>();

        this.k = k;
        this.n = n;

        backtrack(1, n);
        return new ArrayList<>(result);
    }

    void backtrack(int i, int sumLeft) {
        if (sumLeft < 0)
            return;
        if (temp.size() == k) {
            if (sumLeft == 0)
                result.add(new ArrayList<>(temp));
            return;
        }

        for (int j=i; j<10; j++) {
            temp.add(j);
            backtrack(j+1, sumLeft-j);
            temp.remove(temp.size()-1);
        }
    }
}
