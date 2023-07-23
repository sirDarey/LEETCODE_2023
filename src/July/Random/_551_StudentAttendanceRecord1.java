package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 551. Student Attendance Record I
* 
*/

public class _551_StudentAttendanceRecord1 {
	
	public boolean checkRecord(String s) {
        int [] record = new int [2];
        for (char c : s.toCharArray()) {
            if (c == 'A' && ++record[0] == 2)
                return false;
            else if (c == 'L') {
                if (++record[1] == 3)
                    return false;
            }else
                record[1] = 0;
        }
        return true;
    }
}
