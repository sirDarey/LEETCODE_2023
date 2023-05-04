package May;

import java.util.LinkedList;
import java.util.Queue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, May 2023
* Day 4: Problem 649 - Dota2 Senate
*/

public class _4_649_Dota2Senate {
	 public String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>(),
                       D = new LinkedList<>();
        int n = senate.length();
        for(int i = 0; i < n; i++){
            if(senate.charAt(i) == 'R') R.add(i);
            else D.add(i);
        }
        while (!R.isEmpty() && !D.isEmpty()){
            int r = R.poll();
            int d = D.poll();
            if(r < d) R.add(r + n);
            else D.add(d + n);
        }
        return R.size() > D.size() ? "Radiant" : "Dire";
    }
}
