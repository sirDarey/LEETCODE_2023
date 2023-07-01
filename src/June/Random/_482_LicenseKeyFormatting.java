package June.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 482 - License Key Formatting
*/

public class _482_LicenseKeyFormatting {
	
	public String licenseKeyFormatting(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int count = -1;
        for (int i=n-1; i>=0; i--) {
            if (s.charAt(i) == '-')
                continue;
            
            if(++count == k) {
                sb.append('-');
                count = 0;
            }
            sb.append(s.charAt(i));
        }

        return sb.reverse().toString().toUpperCase();
    }
}
