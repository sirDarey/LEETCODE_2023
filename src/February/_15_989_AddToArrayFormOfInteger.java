package February;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
*
* @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 15: Problem 989 - Add to Array-Form of Integer
*/

public class _15_989_AddToArrayFormOfInteger {
	
	public List<Integer> addToArrayForm(int[] num, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int carry = 0, n = num.length, i=n-1;

        while (i>=0 && k > 0) {
            int sum = carry + k%10 + num[i];
            carry = sum/10;
            deque.offerFirst(sum%10);
            i--;
            k /= 10;
        }

        if (k == 0) {
            while (i >= 0) {
                int sum = carry + num[i];
                carry = sum/10;
                deque.offerFirst(sum%10);
                i--;
            }
        } else if (i < 0) {
            while (k > 0) {
                int sum = carry + k%10;
                carry = sum/10;
                deque.offerFirst(sum%10);
                k /= 10;
            }
        }
        if (carry > 0)
            deque.offerFirst(carry);

        return new ArrayList<>(deque);
    }
}
