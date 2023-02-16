package February;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 16: Problem 104 - Maximum Depth of Binary Tree
*/

public class _16_104_MaximumDepthOfBinaryTree {
	
	private class TreeNode {
       TreeNode left;
       TreeNode right;
	}
	
	int maxSoFar = 1;
    
    public int maxDepth(TreeNode root) {
      if (root == null) 
          return 0;
      
      return recur(root, 1);
    }
     
    int recur (TreeNode tempRoot, int max) {
        TreeNode tempRight = tempRoot.right,
                 tempLeft = tempRoot.left;
        if (tempRight != null)
            maxSoFar = Math.max(max, recur (tempRight, max+1));
        if (tempLeft != null)
            maxSoFar = Math.max(max, recur (tempLeft, max+1));
        return Math.max(max, maxSoFar);
    }
}
