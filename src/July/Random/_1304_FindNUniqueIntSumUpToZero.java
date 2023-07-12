package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1304 - Find N Unique Integers Sum up to Zero
*/

public class _1304_FindNUniqueIntSumUpToZero {
	
	public int[] sumZero(int n) {
        int [] result = new int [n];
        int i = 1, j = n/2;
        
        if(n%2 == 0){
            for (int k=0; k<j; k++){
                result[k] = -1*i;
                result[k+j] = i;
                i++;
            }
        } else{
            for (int k=0; k<j; k++){
                result[k] = -1*i;
                result[k+j+1] = i;
                i++;
            }
        }

        return result;
    }
}
