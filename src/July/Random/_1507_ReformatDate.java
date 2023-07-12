package July.Random;

import java.util.HashMap;
import java.util.Map;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1507 - Reformat Date
* 
*/

public class _1507_ReformatDate {
	
	public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        String [] dates = date.split(" ");
        Map<String, String> map = new HashMap<>();

        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");

        String last; char c = dates[0].charAt(1);
        if (c =='t' || c == 's' || c == 'n' || c == 'r')
            last =  "0"+dates[0].substring(0,1);
        else 
            last = dates[0].substring(0,2);
            
        sb.append(dates[2]).append('-').append(map.get(dates[1])).append('-').append(last);

        return sb.toString();
    }
}
