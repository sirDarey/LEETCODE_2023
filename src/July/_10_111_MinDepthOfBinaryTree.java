package July;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, July 2023
 * Day 10: Problem 111 - Minimum Depth of Binary Tree
 * 
 */

public class _10_111_MinDepthOfBinaryTree {
	
	private class TreeNode {
		TreeNode left, right;
	}
	
	int min = 100000;
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        findMin(root, 1);

        return min;
    }

    void findMin(TreeNode node, int count) {
        if (node.left != null) 
            findMin(node.left, count+1);
        if (node.right != null) 
            findMin(node.right, count+1);
        
        if (node.left == null && node.right == null)
            min = Math.min(min, count);
    }
    
}
