package April;

import java.util.Arrays;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 3: Problem 881 - Boats to Save People
*/

public class _3_881_BoatsToSavePeople {
	public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int result = 0, left = 0, right = people.length-1;

        while (right >= 0 && people[right] == limit)  {
            result ++;
            right--;
        }

        while(left <= right) {
            int sum = people[left] + people[right];   
            if (sum <= limit) 
                left ++;
            right--;
            result++;
        }
        
        return result;
    }
}
