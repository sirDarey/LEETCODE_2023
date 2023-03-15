package March;

import java.util.LinkedList;
import java.util.Queue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, March 2023
* Day 15: Problem 958 - Check Completeness of a Binary Tree
* 
*/


public class _15_958_CheckCompletenessOfABinaryTree {
	
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
	
	public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) 
                break;
            queue.offer(node.left);
            queue.offer(node.right);
        }

        while(!queue.isEmpty()) {
            if(queue.poll() != null)
                return false;
        }

        return true;
    }
}
