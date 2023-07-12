package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2303 - Calculate Amount Paid in Taxes
* 
*/

public class _2303_CalculateAmountPaidInTaxes {
	
	public double calculateTax(int[][] brackets, int income) {
        double answer = Math.min(brackets[0][0], income)*brackets[0][1]/100.0;
        int n = brackets.length;
        income -= brackets[0][0];
        int i = 1;

        while (i<n && income > 0) {
            int [] bra = brackets[i];
            int current = Math.min(bra[0] - brackets[i-1][0], income);
            answer += current*bra[1]/100.0;
            income -= current;
            i++;
        }
        return answer;
    }
}
