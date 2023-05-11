package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2169 - Count Operations to Obtain Zero
*/

public class _2169_CountOperationsToObtainZero {
	
	public int countOperations(int num1, int num2) {
        int result = 0;

        while (num1 > 0 && num2 > 0) {
            if (num1 >= num2)
                num1 -= num2;
            else
                num2 -= num1;
            result++;
        }
        
        return result;
    }
}
