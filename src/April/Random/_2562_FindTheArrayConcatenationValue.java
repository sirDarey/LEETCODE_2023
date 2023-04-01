package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2562 - Find the Array Concatenation Value
*/

public class _2562_FindTheArrayConcatenationValue {
	
	public long findTheArrayConcVal(int[] nums) {
        long concatenation = 0;
        int n = nums.length, m = n-1;


        for (int i=0; i<n/2; i++) {
            int temp = nums[m-i];
            int index = String.valueOf(temp).length();

            temp += (int)Math.pow(10, index) * nums[i];

            concatenation += temp;
            System.out.println(concatenation);
        }

        if (n%2 == 1)
            concatenation += nums[n/2];
        
        return concatenation;
    }
}
