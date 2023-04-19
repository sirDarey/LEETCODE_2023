package April;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 19: Problem 1372 - Longest ZigZag Path in a Binary Tree
*/

public class _19_1372_LongestZigZagPathInABinaryTree {
	
	class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
    }
	
	int max = 0;
    public int longestZigZag(TreeNode root) {
        recur(root.left, false, 1);
        recur(root.right, true, 1);

        return max-1;
    }
    //true - Right, false - Left
    void recur (TreeNode node, boolean dir, int count) {
        if (node == null) {
            max = Math.max(max, count);
            return;
        }
        
        if (dir) {            
            recur(node.left, !dir, count+1);
            recur(node.right, dir, 1);
        } else {
            recur(node.left, dir, 1);
            recur(node.right, !dir, count+1);
        }
    }
}
