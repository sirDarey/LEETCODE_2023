package January;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, January 2023
 * Day 10: 100 - Same Tree
 */

public class _10_100_SameTree {
    
	private class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
   }
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p != null && q != null) {
            if (p.val == q.val) 
                if (isSameTree(p.left, q.left))
                    return isSameTree(p.right, q.right);
            return false;
        } 
        return false;
    }
}
