package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1342 - Number of Steps to Reduce a Number to Zero
*
*/

public class _1342_NumOfStepsToReduceANumToZero {
	
	public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num%2 == 0)
                num /= 2;
            else
                num--;

            count++;
        }
        return count;
    }
}
