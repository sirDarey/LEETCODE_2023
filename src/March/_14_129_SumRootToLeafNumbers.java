package March;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 14: Problem 129 - Sum Root to Leaf Numbers
* 
*/


public class _14_129_SumRootToLeafNumbers {
	
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
	
	int sum = 0;

    public int sumNumbers(TreeNode root) {
        dfs (0, root);
        return sum;
    }

    void dfs(int tempSum, TreeNode root) {
	       int newSum = (tempSum*10) + root.val;
	        if (root.left != null)
	            dfs(newSum, root.left);
	        if (root.right != null)
	            dfs(newSum, root.right);
	        if(root.right == null && root.left == null)
	            sum += newSum;
    }
}
