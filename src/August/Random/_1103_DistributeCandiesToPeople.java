package August.Random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 1103 - Distribute Candies to People
*/

public class _1103_DistributeCandiesToPeople {
	
	public int[] distributeCandies(int candies, int num_people) {
        int [] result = new int [num_people];
        int round = 1;

        while (candies > 0) {
            int i = -1;
            while (++i < num_people && candies > 0) {
                result[i] += Math.min(candies, round++);
                candies -= round - 1;
            }
        }
        return result;
    }
}
