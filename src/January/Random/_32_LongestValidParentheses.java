package January.Random;

import java.util.Stack;

/**
*
* @Sir Darey
* 
* LeetCode Problem 63 - UniquePaths II
*/

public class _32_LongestValidParentheses {
	
	public int longestValidParentheses(String s) {
        int n = s.length();
        if (n < 2)
            return 0;
        
        Stack <Integer> stack = new Stack<>();
        stack.push(-1);
        int max  = 0;

        for (int i=0; i<n; i++){
            if (s.charAt(i) == ')') {
                stack.pop();
                if(stack.isEmpty())
                    stack.push(i);
                max = Math.max(max, i - stack.peek());
            } else
                stack.push(i);
        }
        return max;        
    }
}
