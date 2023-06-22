package June;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 12: 228 - Summary Ranges
 * 
 */

public class _12_228_SummaryRanges {
	
	public List<String> summaryRanges(int[] nums) {
        List <String> result = new ArrayList<>();
        int i = 0, n = nums.length;

        while (i < n) {
            StringBuilder sb = new StringBuilder();
            int current = i;
            ++i;

            while(i < n && nums[i]-nums[i-1] == 1) {
                ++i;
            }

            if (i-current == 1)
                sb.append(nums[current]);
            else 
                sb.append(nums[current]).append("->").append(nums[i-1]);
            result.add(sb.toString());
        }

        return result;
    }
}
