package February;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 17: Problem 783 - Minimum Distance Between BST Nodes
*/

public class _17_783MinimumDistanceBetweenBSTNodes {
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	int minDiff = Integer.MAX_VALUE;
    int prev = -1;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    void inorder(TreeNode root) {
        if (root == null) 
            return;
        
        inorder(root.left);
        if (prev >= 0) {
            minDiff = Math.min(minDiff, Math.abs(root.val - prev));
        }
        prev = root.val;
        inorder(root.right);
    }
}
