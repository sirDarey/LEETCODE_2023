package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1903 - Largest Odd Number in String

*/

public class _1903_LargestOddNumberInString {
	
	public String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--){
            if((num.charAt(i)-'0')%2 == 1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
