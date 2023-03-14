package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 13: Problem 101 - Symmetric  Tree
* 
*/


public class _13_101_SymmetricTree {
	
	public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode() {}
		       TreeNode(int val) { this.val = val; }
		       TreeNode(int val, TreeNode left, TreeNode right) {
		           this.val = val;
		           this.left = left;
		           this.right = right;
		       }
	 }
	
	public boolean isSymmetric(TreeNode root) {
        return recur(root.left, root.right);
    }

    boolean recur(TreeNode leftSubTree, TreeNode rightSubTree) {
        if (leftSubTree == null && rightSubTree==null)
            return true;

        if (leftSubTree == null || rightSubTree==null)
            return false;

        return leftSubTree.val == rightSubTree.val &&
                recur(leftSubTree.left, rightSubTree.right) &&
                recur(leftSubTree.right, rightSubTree.left);
    }
}
