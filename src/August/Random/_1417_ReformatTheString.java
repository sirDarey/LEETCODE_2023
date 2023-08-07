package August.Random;

import java.util.Arrays;

/**
*
* @Sir Darey
* 
* LeetCode Problem 1417 - Reformat The String
*/

public class _1417_ReformatTheString {
	
	public String reformat(String s) {    
        int n = s.length();
        if (n == 1)
            return s;

        char [] arr = s.toCharArray();
        Arrays.sort(arr);

        int i = -1, mid = n/2, m = n-1;

        while(++i < n && Character.isDigit(arr[i])) {
            if (m-i < mid)
                return "";
        }
        if (i < mid)
            return "";

        int num = i;
        if (n-i > num)
            return format(i, n, 0, i, arr);
    
        return format(0, i, i, n, arr);
    }

    String format(int i, int iend, int j, int jend, char [] arr) {
        StringBuilder sb = new StringBuilder();
        while (i < iend && j < jend) {
            sb.append(arr[i++]).append(arr[j++]);
        }
        if (i < iend)
            sb.append(arr[i]);
        return sb.toString();
    }
}
