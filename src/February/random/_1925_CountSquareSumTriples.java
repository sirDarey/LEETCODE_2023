package February.random;

/**
*
* @Sir Darey
* 
* LeetCode Problem  1925 - Count Square Sum Triples
*/

public class _1925_CountSquareSumTriples {
	
	public int countTriples(int n) {
        int result = 0;

        for (int i=1; i<n; i++) {
            int a = i*i;
            
            for (int j=i+1; j<n; j++) {
            	
                int b = j*j;
                int sum = a+b;
                int sqrt = (int) Math.sqrt(sum);
                
                if (sqrt <= n) {
                    if (sqrt*sqrt == sum)
                        result += 2;
                } else
                    break;
            }
        }
        return result;
    }
}
