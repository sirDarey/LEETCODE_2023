package July.Random;

import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 168 - Excel Sheet Column Title
* 
*/

public class _168_ExcelSheetColumnTitle {
	
	public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        List <Character> list = List.of('0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        
        while (columnNumber > 0) {
            int R = columnNumber%26;
            columnNumber /= 26;

            if (R == 0) {
                sb.append(list.get(26));
                columnNumber--;
            } else
                sb.append(list.get(R));
            
        }
        return sb.reverse().toString();
    }
}
