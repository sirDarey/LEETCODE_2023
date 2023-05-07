package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 12 Integer To Roman
*/

public class _12_IntegerToRoman {
	
	StringBuilder sb = new StringBuilder();
    String [] thousands = {"M", "MM", "MMM"};
    String [] hundreds = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String [] tens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String [] units = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        
        while (num > 0) {
            if (num >= 1000) num = helper(num, thousands, 1000);
            else if (num >= 100) num = helper(num, hundreds, 100); 
            else if(num >= 10) num = helper(num, tens, 10); 
            else num = helper(num, units, 1);
        }       

        return sb.toString();
    }

    int helper (int num, String [] placeValue, int divisor) {
        sb.append(placeValue[(num/divisor) - 1]);
        return num%divisor;
    }
}
