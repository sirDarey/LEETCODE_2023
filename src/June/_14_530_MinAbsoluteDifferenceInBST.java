package June;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 14: Problem 530 - Minimum Absolute Difference in BST
 * 
 */

public class _14_530_MinAbsoluteDifferenceInBST {
	
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
   }
	
	int minDiff = Integer.MAX_VALUE, temp = minDiff;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }
    
    void inOrder(TreeNode node){
        if (node == null)
            return;

        inOrder(node.left);
        minDiff = Math.min(minDiff, Math.abs(node.val - temp));
        temp = node.val;
        inOrder(node.right);
    }
}
