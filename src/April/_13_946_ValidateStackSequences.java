package April;

import java.util.Stack;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 13: Problem 946 - Validate Stack Sequences
*/

public class _13_946_ValidateStackSequences {
	 public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0, j = 0, n = pushed.length;
        Stack <Integer> stack = new Stack<>();

        while(i < n) {
            int I = pushed[i], J = popped[j];
            if (I == J) {
                i++; j++;
            } else {
                if (!stack.isEmpty() && stack.peek() == J) {
                    stack.pop();
                    j++;
                }
                else {
                    stack.push(I);
                    i++;
                }
            }
        }

        while(!stack.isEmpty()) {
            if (stack.pop() != popped[j])
                return false;
            j++;
        }
        return true;
    }
}
