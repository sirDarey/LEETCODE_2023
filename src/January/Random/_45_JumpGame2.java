package January.Random;

/**
*
* @Sir Darey
* 
* LeetCode Problem 45 - Jump Game2
*/

public class _45_JumpGame2 {
	
	public int jump(int[] nums) {
        int goal = nums.length-1;
        int minJump = 0;
        int left = 0, right = 0, temp = 0;
        
        while (right < goal) {
            for (int i=left; i<=right; i++) 
                temp = Math.max(temp, i + nums[i]);
           
            minJump++;
            left = right+1;
            right = temp;
        }
        return minJump;
    }
}
