package February.random;

import java.util.Deque;
import java.util.LinkedList;

/**
*
* @Sir Darey
* 
* LeetCode Problem 1696 - Jump Game VI
*/

public class _1696_JumpGame4 {
	
	public int maxResult(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(n-1);

        for (int i=n-2; i>=0; i--) {
            if(deque.peekFirst() - i > k)
                deque.pollFirst();

            nums[i] += nums[deque.peekFirst()];

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();
            deque.offerLast(i);
        }
        return nums[0];
    }
}
