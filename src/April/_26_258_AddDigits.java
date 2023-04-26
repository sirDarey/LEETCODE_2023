package April;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 26: Problem 258 - Add Digits
*/

public class _26_258_AddDigits {
	
	public int addDigits(int num) {
        while (num > 9) {
            int temp = 0;
            while (num > 0) {
                temp += num%10;
                num /= 10;
            }
            num = temp;
        }
        return num;
    }
}
