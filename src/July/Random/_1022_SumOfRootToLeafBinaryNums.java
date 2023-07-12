package July.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 1022 - Sum of Root To Leaf Binary Numbers
* 
*/

public class _1022_SumOfRootToLeafBinaryNums {
	
	private class TreeNode {
		TreeNode left, right;
		int val;
	}
	
	public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    int dfs(TreeNode node, int sum) {
        if (node == null)
            return 0;
        sum = (2*sum) + node.val;
        if (node.left == null && node.right == null)
            return sum;
        return dfs(node.left, sum) + dfs(node.right, sum);
    }
}
