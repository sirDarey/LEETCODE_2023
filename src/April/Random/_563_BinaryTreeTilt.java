package April.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 563 - Binary Tree Tilt
*/

public class _563_BinaryTreeTilt {
	class TreeNode {
	     int val;
		 TreeNode left;
		 TreeNode right;
	}
	
	int result = 0;
    public int findTilt(TreeNode root) {
        if (root == null)
            return 0;
        recur(root);
        return result;
    }

    int recur(TreeNode node) {
        if (node == null)
            return 0;
        
        int leftSum = recur(node.left);
        int rightSum = recur(node.right);
        result += Math.abs(leftSum - rightSum);
        
        return leftSum + rightSum + node.val;
    }
}
