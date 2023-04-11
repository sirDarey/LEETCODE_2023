package April;

import java.util.Stack;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 10 : Problem 20 - Valid Parentheses
*/

public class _10_20_ValidParentheses {
	public boolean isValid(String s) {
		Stack <Character> stack = new Stack<>();
    
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if (!stack.isEmpty()) {
                char open = stack.pop();
                if ((open == '(' && c == ')')
                    || (open == '[' && c == ']')
                    || (open == '{' && c == '}'))
                    continue;
                else
                    return false;
            } else
                return false;
        }
        return stack.isEmpty();
    }
	    
}
