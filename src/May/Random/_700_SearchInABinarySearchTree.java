package May.Random;

/**  
* 
*  @Sir Darey
* 
* LeetCode Problem 700 - Search in a Binary Search Tree
*/

public class _700_SearchInABinarySearchTree {
	
	class TreeNode {
		int val;
		TreeNode left, right;
	}
	
	public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        int currentVal = root.val;
        if (currentVal == val)
            return root;
        else if(currentVal > val)
            return searchBST(root.left, val);
        else
           return searchBST(root.right, val);
    }
}
