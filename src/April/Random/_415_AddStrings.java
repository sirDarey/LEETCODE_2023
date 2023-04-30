package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 415 - Add Strings
*/

public class _415_AddStrings {
	
	StringBuilder sb = new StringBuilder();

    public String addStrings(String num1, String num2) {
        int m = num1.length()-1, n = num2.length()-1, carry = 0;

        while (m>=0 && n>=0) {
            carry = helper(num1.charAt(m)-'0', num2.charAt(n)-'0', carry);
            m--; n--;
        }
        if (m < n) {
            while (n >= 0) {
                carry = helper(0, num2.charAt(n)-'0', carry);
                n--;
            }
        } else if (n < m) {
            while ( m >= 0) {
                carry = helper(num1.charAt(m)-'0', 0, carry);
                m--;
            }
        }
        if (carry > 0)
            sb.append(carry);
        return (sb.reverse().toString());
    }

    int helper (int x, int y, int carry){
        int sum = x+y+carry;
        sb.append(sum%10);
        return sum/10;
    }
}
