package February;

import java.util.Stack;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 18: Problem 226 - Invert Binary Tree
*/

public class _18_226_InvertBinaryTree {
	
	private class TreeNode {
		TreeNode left;
		TreeNode right;
	}
	
	public TreeNode invertTree(TreeNode root) {
       if (root == null) 
           return null;
        
        Stack <TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()){
           TreeNode tempRoot = stack.pop(),
            tempRight = tempRoot.left,
          tempLeft = tempRoot.right; 
            tempRoot.left = tempLeft;
            tempRoot.right = tempRight;
            if (tempLeft!=null) stack.push(tempLeft);
            if (tempRight!=null) stack.push(tempRight);
        }
        return root;
    }
}
