package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 2: Problem 443 - String Compression

*/

public class _2_443_StringCompression {
	
	public int compress(char[] chars) {
        int i = 0, n = chars.length, k = -1;

        while(i < n) {
            int j = i+1, count = 1; 
            char current = chars[i];

            while(j < n && chars[j] == current) {
                count++;
                j++;
            }

            chars[++k] = current;
            if (count > 1) 
                for (char c : String.valueOf(count).toCharArray()) 
                    chars[++k] = c;
                
            i = j;
        }
        return k+1;
    }
}
