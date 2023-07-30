package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 2490 - Circular Sentence
* 
*/

public class _2490_CircularSentence {
	
	public boolean isCircularSentence(String sentence) {
        String [] arr = sentence.split(" ");
        int n = arr.length;
        if (arr[0].charAt(0) != arr[n-1].charAt(arr[n-1].length()-1))
            return false;
        
        for (int i=0; i<n-1; i++) {
            if (arr[i].charAt(arr[i].length()-1) != arr[i+1].charAt(0))
                return false;
        }
        return true;
    }
}
