package January;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 20: 491 - Non-decreasing Subsequences
 */

public class _20_491_NonDecreasingSubsequences {
    
	 public List<List<Integer>> findSubsequences(int[] nums) {
	        
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        backtrack (nums, 0, temp, result);

        return new ArrayList<>(result);
    }

    void backtrack(int[] nums, int i, List<Integer> temp, Set<List<Integer>> result) {
        if (i == nums.length) {
            if (temp.size() >= 2) 
                result.add(new ArrayList<>(temp));
            return; 
        }
           
        if (temp.isEmpty() || temp.get(temp.size()-1) <= nums[i]) {
            temp.add(nums[i]);
            backtrack(nums, i+1, temp, result);
            temp.remove(temp.size()-1);
        }       
        
        backtrack(nums, i+1, temp, result);
    }
}
