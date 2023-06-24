package June;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge, June 2023
 * Day 15: Problem 1161 - Maximum Level Sum of a Binary Tree
 * 
 */

public class _15_1161_MaxLevelSumOfABinaryTree {
	
	public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
    }
	
	public int maxLevelSum(TreeNode root) {

        Queue <TreeNode> nodes = new LinkedList<>();
        int maxLevel = 1, maxSum = -1000000, currentLevel = 1;
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            int sum = 0, size = nodes.size();

            for (int i=0; i<size; i++) {
                TreeNode current = nodes.poll();
                sum += current.val;

                if (current.left != null) nodes.offer(current.left);
                if (current.right != null) nodes.offer(current.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = currentLevel;
            }
            currentLevel++;
        }

        return maxLevel;
    }
}
