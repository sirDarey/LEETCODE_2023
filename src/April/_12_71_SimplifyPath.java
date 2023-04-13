package April;

import java.util.Stack;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 12: Problem 71 - Simplify Path
*/

public class _12_71_SimplifyPath {
	public String simplifyPath(String path) {
        Stack <String> stack = new Stack<>();
        String [] dirs = path.split("/");

        for (String dir : dirs) {
            if (dir.equals(".") || dir.isEmpty())
                continue;
            else if (dir.equals("..")){
                if (!stack.isEmpty())
                    stack.pop();
            } else
                stack.push(dir);
        }
        return "/"+ String.join("/", stack);
    }
}
