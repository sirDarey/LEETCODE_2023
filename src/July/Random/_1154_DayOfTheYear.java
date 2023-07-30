package July.Random;

import java.util.List;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1154 - Day of the Year
* 
*/

public class _1154_DayOfTheYear {
	
	public int dayOfYear(String date) {
        String [] dateStr = date.split("-");
        int year = Integer.parseInt(dateStr[0]);
        int month = Integer.parseInt(dateStr[1]);
        List <Integer> months = List.of(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334);
        
        int day = Integer.parseInt(dateStr[2]) + months.get(month-1);
        
        if (month > 2 && year%4 == 0){
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    day++; 
            }else
                day++;
        }
        return day;
    }
}
