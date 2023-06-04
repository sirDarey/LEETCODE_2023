package June.Random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2094 - Finding 3-Digit Even Numbers
* 
*/

public class _2094_Finding3DigitEvenNumbers {
	
	public int[] findEvenNumbers(int[] digits) {
        Set <Integer> set = new  HashSet<>();
        int n = digits.length;

        for (int i=0; i<n; i++) {
            int unit = digits[i];
            if (unit%2 == 0) {
                for (int j=0; j<n-1; j++) {
                    if(i != j) {
                        for (int k=j+1; k<n; k++) {
                            if (k != i) {                                
                                if (digits[k] != 0)
                                    set.add((100*digits[k]) + (10*digits[j]) + unit);

                                if (digits[j] != 0 && digits[k] != digits[j])   
                                    set.add((100*digits[j]) + (10*digits[k]) + unit);
                            }
                        }
                    }
                }
            }
        }

        int [] result = new int[set.size()];
        int idx = 0;
        for (int i : set) {
            result[idx] = i;
            idx++;
        }        

        Arrays.sort(result);
        return result;
        // 132, 312, 102, 302, 210,  120, 130, 310, 230, 320
    }
}
