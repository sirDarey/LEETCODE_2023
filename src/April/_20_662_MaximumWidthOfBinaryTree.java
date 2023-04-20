package April;

import java.util.LinkedList;
import java.util.Queue;

/**  
* 
*  @Sir Darey
* 
* LeetCode Daily Challenge, April 2023
* Day 20: Problem 662 - Maximum Width of Binary Tree
*/

public class _20_662_MaximumWidthOfBinaryTree {
	
	class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
    }
	
	public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int maxWidth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();
        queue.offer(root);
        indexQueue.offer(1);
        
        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            int rightIndex = indexQueue.peek(),
                leftIndex = rightIndex;
            
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                rightIndex = indexQueue.poll();
                
                if (node.left != null) {
                    queue.offer(node.left);
                    indexQueue.offer(rightIndex * 2);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    indexQueue.offer(rightIndex * 2 + 1);
                }
            }
                        
            maxWidth = Math.max(maxWidth, rightIndex - leftIndex + 1);
        }
        
        return maxWidth;
    }
}
