package February;

/**
*
* @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 14: Problem 67 - Add Binary
*/

public class _14_67_AddBinary {
	
	public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1,
            j = b.length() - 1,
            carry = 0;

        while(i>=0 && j>=0){
            int sum = carry + a.charAt(i) - '0' + b.charAt(j) - '0';
            carry = sum/2;
            res.append(sum % 2);
            i--; j--;
        }

        if (i<0) {
            while(j>=0){
                int sum = carry + b.charAt(j) - '0';
                carry = sum/2;
                res.append(sum % 2);
                j--;
            }
        } else if (j<0) {
            while(i>=0){
                int sum = carry + a.charAt(i) - '0';
                carry = sum/2;
                res.append(sum % 2);
                i--;
            }
        }

        if(carry != 0){ 
            res.append(carry);
        }
        
        return res.reverse().toString();
    }
}
