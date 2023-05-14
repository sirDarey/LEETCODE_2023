package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1859 - Sorting the Sentence
*/

public class _1859_SortingTheSentence {
	
	public String sortSentence(String s) {
        String [] arr = s.split(" ");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                String current = arr[j]; 
                if(current.charAt(current.length()-1) - '0' == i+1) {
                    sb.append(current.substring(0, current.length()-1)).append(" ");
                    break;
                }
            }
        }
        String string = sb.toString();
        return string.substring(0, string.length()-1);
    }
}
