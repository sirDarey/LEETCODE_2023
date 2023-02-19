package February;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, February 2023
* Day 19: Problem 103 - Binary Tree Zigzag Level Order Traversal
*/

public class _19_103_BinaryTreeZigzagLevelOrderTraversal {
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int levelNodes = 1;

        while (!queue.isEmpty()) {
            List <Integer> temp = new ArrayList<>();
            int nodes = levelNodes;
            levelNodes = 0;

            while (nodes > 0) {
                TreeNode current = queue.poll();
                temp.add(current.val);
                nodes--;
                if (current.left != null) {
                    queue.offer(current.left);
                    levelNodes++;
                }                    
                if (current.right != null) {
                    queue.offer(current.right);
                    levelNodes++;
                }                    
            }
            result.add(temp);
        }

        for (int i=1; i<result.size(); i+=2) 
            Collections.reverse(result.get(i));
        
        return result;
    }
}
