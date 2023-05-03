package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 3: Problem 2215 - Find the Difference of Two Arrays
*/

public class _3_2215_FindTheDiffOfTwoArrays {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set <Integer> A = new HashSet<>(),
                    B = new HashSet<>(), C;
        for (int num1 : nums1)
            A.add(num1);
        for (int num2 : nums2)
            B.add(num2);
        C = new HashSet<>(B);

        A.forEach(a -> {
            B.remove(a);
        });
        C.forEach(b -> {
            A.remove(b);
        });
        List<Integer> L1 = new ArrayList<>(A);
        List<Integer> L2 = new ArrayList<>(B);
        List<List<Integer>> result = Arrays.asList(L1, L2);
        return result;
    }
}
